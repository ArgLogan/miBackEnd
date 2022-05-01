package com.miPorfolio.porfback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jj_roma
 */
@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
   
    private String nombre;
    private String apellido;
    private String banner;
    private String fPerfil;
    private String titulo;
    private String about;
    private String wahtsapp;
    
    public Persona(){
    }

    public Persona(Long id, String nombre, String apellido, String banner, String fPerfil, String titulo, String about, String wahtsapp) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.banner = banner;
        this.fPerfil = fPerfil;
        this.titulo = titulo;
        this.about = about;
        this.wahtsapp = wahtsapp;
    }

  

    
    
   
}
