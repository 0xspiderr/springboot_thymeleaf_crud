package com.project.springboot_thymeleaf_crud.Masina;

import com.project.springboot_thymeleaf_crud.Utilizator.Utilizator;
import com.project.springboot_thymeleaf_crud.Utilizator.UtilizatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@Controller
public class MasinaController
{
    @Autowired
    MasinaRepository repository;
    @Autowired
    UtilizatorRepository utilizatorRepository;

    @GetMapping("/masini")
    public String getListaMasini(Model model,
                                   @RequestParam(required = false) String marca,
                                   @RequestParam(required = false) String culoare,
                                   @RequestParam(required = false) String combustibil)
    {
        String filtru_marca = (marca != null && !marca.isEmpty()) ? marca.toLowerCase() : null;
        String filtru_culoare = (culoare != null && !culoare.isEmpty()) ? culoare.toLowerCase() : null;
        String filtru_combustibil = (combustibil != null && !combustibil.isEmpty()) ? combustibil.toLowerCase() : null;

        List<Masina> masini = repository.findAll();

        List<Masina> lista_filtrata = masini.stream()
                .filter(m -> m.getMarca().equals(filtru_marca) || filtru_marca == null)
                .filter(m -> m.getCuloarea().equals(filtru_culoare) || filtru_culoare == null)
                .filter(m -> m.getTipulDeCombustibil().equals(filtru_combustibil) || filtru_combustibil == null)
                .toList();


        String str = "Toate masinile";
        model.addAttribute("str", str);
        model.addAttribute("lista", lista_filtrata);
        model.addAttribute("marcaSelectata", marca);
        model.addAttribute("culoareaSelectata", culoare);
        model.addAttribute("combustibilSelectat", combustibil);

        return "masini";
    }

    @GetMapping("/masini/adauga")
    public String adaugaMasina(Model model)
    {
        model.addAttribute("masina", new Masina());
        model.addAttribute("isEditMode", false);
        return "form-masina";
    }

    @GetMapping("/masini/editeaza/{id}")
    public String editMasina(@PathVariable String id, Model model)
    {
        Optional<Masina> masina = repository.findById(id);
        if (masina.isPresent()) {
            model.addAttribute("masina", masina.get());
            model.addAttribute("isEditMode", true);
            return "form-masina";
        }
        return "redirect:/masini";
    }

    @PostMapping("/masini/salveaza")
    public String saveMasina(@ModelAttribute Masina masina, Principal principal)
    {
        // If it's a new car (no owner yet), assign the current editor as the owner
        if (masina.getIdUtilizator() == 0) {
            Utilizator currentUser = utilizatorRepository.findByUtilizator(principal.getName()).orElse(null);
            if (currentUser != null) {
                masina.setIdUtilizator(currentUser.getIdUtilizator());
            }
        }
        // If editing, the hidden field or existing object keeps the original id_utilizator

        repository.save(masina);
        return "redirect:/masini";
    }

    @PostMapping("/masini/sterge/{id}")
    public String deleteMasina(@PathVariable String id)
    {
        repository.deleteById(id);
        return "redirect:/masini";
    }
}
