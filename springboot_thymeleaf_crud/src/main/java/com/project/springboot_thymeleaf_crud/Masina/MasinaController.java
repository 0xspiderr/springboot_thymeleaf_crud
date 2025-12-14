package com.project.springboot_thymeleaf_crud.Masina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class MasinaController
{
    @Autowired
    MasinaRepository repository;

    @GetMapping("/masini")
    public String get_lista_masini(Model model)
    {
        String str = "Lista masinilor preluate prin repository";
        model.addAttribute("str", str);
        model.addAttribute("lista", repository.findAll());
        return "masini";
    }


}
