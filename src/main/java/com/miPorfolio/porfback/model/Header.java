package com.miPorfolio.porfback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Header {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String apLogo;
    private String apText;
    private String lidin;
    private String github;
    private String twitter;
    private String facebook;
    private String email;
    private String wahtsapp;

    public Header() {
    }

    public Header(Long id, String nombre, String apLogo, String apText, String lidin, String github, String twitter, String facebook, String email, String wahtsapp) {
        this.id = id;
        this.nombre = nombre;
        this.apLogo = apLogo;
        this.apText = apText;
        this.lidin = lidin;
        this.github = github;
        this.twitter = twitter;
        this.facebook = facebook;
        this.email = email;
        this.wahtsapp = wahtsapp;
    }
    
    
    
}
