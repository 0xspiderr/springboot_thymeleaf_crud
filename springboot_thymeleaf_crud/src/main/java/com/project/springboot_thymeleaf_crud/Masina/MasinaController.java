package com.project.springboot_thymeleaf_crud.Masina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MasinaController
{
    @Autowired
    MasinaRepository repository;

    @GetMapping("/masini")
    public List<Masina> find_all()
    {
        return repository.findAll();
    }

    
}
