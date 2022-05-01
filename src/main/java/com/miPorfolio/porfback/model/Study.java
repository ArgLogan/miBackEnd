package com.miPorfolio.porfback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Study {
    @Id 
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    //private long idIdioma;
    private String institucion;
    private String periodo;
    private String  titulo;
    private boolean completo;
    private String descripcion;

    public Study() {
    }

    public Study(Long id, String institucion, String periodo, String titulo, boolean completo, String descripcion) {
        this.id = id;
        this.institucion = institucion;
        this.periodo = periodo;
        this.titulo = titulo;
        this.completo = completo;
        this.descripcion = descripcion;
    }
  
}
