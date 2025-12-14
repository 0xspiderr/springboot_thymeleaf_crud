package com.project.springboot_thymeleaf_crud.Utilizator;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name="utilizatori")
public class Utilizator
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_utilizator")
    private int idUtilizator;
    private String nume;
    private String utilizator;
    private String parola;
    private String rol;
}
