package com.PortfolioAW.PorfolioAugustoWernli.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String empresa;
    private String titulo;
    private String logo;
    private String fecha_inicio;
    private String fecha_fin;
    private String descripcion;
    private String programas;

    public Long getid() {
        return id;
    }

    public String gettitulo() {
        return titulo;
    }    
    public String getempresa() {
        return empresa;
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
    public String getdescripcion() {
        return descripcion;
    }

    public String getprogramas(){
        return programas;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setempresa(String empresa) {
        this.empresa = empresa;
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
    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setprogramas(String programas){
        this.programas = programas;
    }
}