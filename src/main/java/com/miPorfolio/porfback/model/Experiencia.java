
package com.miPorfolio.porfback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long  id;
    
    
    private String periodo;
    private String nombre;
    private String puesto;
    private String tareas;
    private String tipo;
    private boolean actual;

    public Experiencia() {
    }

    public Experiencia(Long id, String periodo, String nombre, String puesto, String tareas, String tipo, boolean actual) {
        this.id = id;
        this.periodo = periodo;
        this.nombre = nombre;
        this.puesto = puesto;
        this.tareas = tareas;
        this.tipo = tipo;
        this.actual = actual;
    }
    
    
    
}
