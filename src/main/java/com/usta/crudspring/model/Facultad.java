package com.usta.crudspring.model;

import javax.persistence.*;

@Entity
@Table(name="facultades")
public class Facultad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cod_facultad")
    private Long codFacultad;

    @Column(name="nombre_facultad")
    private String nombreFacultad;

    public Facultad(Long codFacultad, String nombreFacultad) {
        this.codFacultad = codFacultad;
        this.nombreFacultad = nombreFacultad;
    }

    public Facultad() {
    }

    public Long getCodFacultad() {
        return codFacultad;
    }

    public void setCodFacultad(Long codFacultad) {
        this.codFacultad = codFacultad;
    }

    public String getNombreFacultad() {
        return nombreFacultad;
    }

    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }
}
