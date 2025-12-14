package com.project.springboot_thymeleaf_crud.Masina;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name="masini")
public class Masina
{
    @Id
    @Column(name = "nr_inmatriculare")
    private String nrInmatriculare;
    @Column(name = "id_utilizator")
    private int idUtilizator;
    private String marca;
    @Column(name = "modelul")
    private String model;
    private String culoarea;
    @Column(name = "anul_fabricatiei")
    private int anulFabricatiei;
    @Column(name = "capacitatea_cilindrica")
    private int capacitateaCilindrica;
    @Column(name = "tipul_de_combustibil")
    private String tipulDeCombustibil;
    private int puterea;
    private int cuplul;
    @Column(name = "volumul_portbagajului")
    private int volumulPortbagajului;
    @Column(name = "pretul")
    private int pret;
}
