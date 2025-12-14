package com.project.springboot_thymeleaf_crud.Masina;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="masini")
public class Masina
{
    @Id
    private String nr_inmatriculare;
    private int id_utilizator;
    private String marca;
    private String modelul;
    private String culoarea;
    private int anul_fabricatiei;
    private int capacitatea_cilindrica;
    private String tipul_de_combustibil;
    private int puterea;
    private int cuplul;
    private int volumul_portbagajului;
    private int pretul;

    public Masina(String nr_inmatriculare,
                  int id_utilizator,
                  String marca,
                  String modelul,
                  String culoarea,
                  int anul_fabricatiei,
                  int capacitatea_cilindrica,
                  String tipul_de_combustibil,
                  int puterea, int cuplul,
                  int volumul_portbagajului,
                  int pretul) {
        this.nr_inmatriculare = nr_inmatriculare;
        this.id_utilizator = id_utilizator;
        this.marca = marca;
        this.modelul = modelul;
        this.culoarea = culoarea;
        this.anul_fabricatiei = anul_fabricatiei;
        this.capacitatea_cilindrica = capacitatea_cilindrica;
        this.tipul_de_combustibil = tipul_de_combustibil;
        this.puterea = puterea;
        this.cuplul = cuplul;
        this.volumul_portbagajului = volumul_portbagajului;
        this.pretul = pretul;
    }

    public Masina() {
    }

    public String getNr_inmatriculare() {
        return nr_inmatriculare;
    }

    public void setNr_inmatriculare(String nr_inmatriculare) {
        this.nr_inmatriculare = nr_inmatriculare;
    }

    public int getId_utilizator() {
        return id_utilizator;
    }

    public void setId_utilizator(int id_utilizator) {
        this.id_utilizator = id_utilizator;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelul() {
        return modelul;
    }

    public void setModelul(String modelul) {
        this.modelul = modelul;
    }

    public String getCuloarea() {
        return culoarea;
    }

    public void setCuloarea(String culoarea) {
        this.culoarea = culoarea;
    }

    public int getAnul_fabricatiei() {
        return anul_fabricatiei;
    }

    public void setAnul_fabricatiei(int anul_fabricatiei) {
        this.anul_fabricatiei = anul_fabricatiei;
    }

    public int getCapacitatea_cilindrica() {
        return capacitatea_cilindrica;
    }

    public void setCapacitatea_cilindrica(int capacitate_cilindrica) {
        this.capacitatea_cilindrica = capacitate_cilindrica;
    }

    public String getTipul_de_combustibil() {
        return tipul_de_combustibil;
    }

    public void setTipul_de_combustibil(String tipul_de_combustibil) {
        this.tipul_de_combustibil = tipul_de_combustibil;
    }

    public int getPuterea() {
        return puterea;
    }

    public void setPuterea(int puterea) {
        this.puterea = puterea;
    }

    public int getCuplul() {
        return cuplul;
    }

    public void setCuplul(int cuplul) {
        this.cuplul = cuplul;
    }

    public int getVolumul_portbagajului() {
        return volumul_portbagajului;
    }

    public void setVolumul_portbagajului(int volumul_portbagajului) {
        this.volumul_portbagajului = volumul_portbagajului;
    }

    public int getPretul() {
        return pretul;
    }

    public void setPretul(int pretul) {
        this.pretul = pretul;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "nr_inmatriculare=" + nr_inmatriculare +
                ", id_utilizator=" + id_utilizator +
                ", marca='" + marca + '\'' +
                ", modelul='" + modelul + '\'' +
                ", culoarea='" + culoarea + '\'' +
                ", anul_fabricatiei=" + anul_fabricatiei +
                ", capacitate_cilindrica=" + capacitatea_cilindrica +
                ", tipul_de_combustibil=" + tipul_de_combustibil +
                ", puterea=" + puterea +
                ", cuplul=" + cuplul +
                ", volumul_portbagajului=" + volumul_portbagajului +
                ", pretul=" + pretul +
                '}';
    }
}
