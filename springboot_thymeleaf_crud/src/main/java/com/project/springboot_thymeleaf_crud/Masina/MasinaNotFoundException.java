package com.project.springboot_thymeleaf_crud.Masina;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class MasinaNotFoundException extends RuntimeException {
    public MasinaNotFoundException(String message) {
        super(message);
    }
}
