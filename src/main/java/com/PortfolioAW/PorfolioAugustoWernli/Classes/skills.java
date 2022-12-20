package com.PortfolioAW.PorfolioAugustoWernli.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class skills {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String titulo_rep;
    private String skill;
    private int dominio;

    public Long getId() {
        return id;
    }

    public String gettitulo_rep() {
        return titulo_rep;
    }    
    public String getskill() {
        return skill;
    }
    public int getdominio() {
        return dominio;
    }

    public void settitulo_rep(String titulo_rep) {
        this.titulo_rep = titulo_rep;
    }
    public void setskill(String skill) {
        this.skill = skill;
    }
    public void setdominio(int dominio) {
        this.dominio = dominio;
    }
}