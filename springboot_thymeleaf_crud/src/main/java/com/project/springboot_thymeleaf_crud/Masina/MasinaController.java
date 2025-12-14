package com.project.springboot_thymeleaf_crud.Masina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class MasinaController
{
    @Autowired
    MasinaRepository repository;

    @GetMapping("/masini")
    public String get_lista_masini(Model model,
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
}
