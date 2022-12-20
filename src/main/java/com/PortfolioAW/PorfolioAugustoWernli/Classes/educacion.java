package com.PortfolioAW.PorfolioAugustoWernli.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String titulo;
    private String tipo;
    private String lugar;
    private String logo;
    private String fecha_inicio;
    private String fecha_fin;

    public Long getid() {
        return id;
    }

    public String gettipo(){
        return tipo;
    }

    public String gettitulo() {
        return titulo;
    }    
    public String getlugar() {
        return lugar;
    }
    public String getlogo() {
        return logo;
    }
    public String getfecha_inicio() {
        return fecha_inicio;
    }    
    public String getfecha_fin() {
        return fecha_fin;
    }
    public void settitulo(String titulo) {
        this.titulo = titulo;
    }

    public void settipo(String tipo){
        this.tipo = tipo;
    }
    public void setlugar(String lugar) {
        this.lugar = lugar;
    }
    public void setlogo(String logo) {
        this.logo = logo;
    }
    public void setfecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    public void setfecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
}