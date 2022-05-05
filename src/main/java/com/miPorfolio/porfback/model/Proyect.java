package com.miPorfolio.porfback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyect {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String imagen;
    private String enlace;
    private String detalle;

    public Proyect() {
    }

    public Proyect(Long id, String nombre, String imagen, String enlace, String detalle) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.enlace = enlace;
        this.detalle = detalle;
    }
    
    
}
