
package com.miPorfolio.porfback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    @Id 
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private byte porcentaje;
    private String titulo;
    private String subtitulo;
    private String color;
    private String fotoUrl;

    public Skill() {
    }

    public Skill(Long id, byte porcentaje, String titulo, String subtitulo, String color, String fotoUrl) {
        this.id = id;
        this.porcentaje = porcentaje;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.color = color;
        this.fotoUrl = fotoUrl;
    }

    
}
