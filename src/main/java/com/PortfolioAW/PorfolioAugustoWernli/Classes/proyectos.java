package com.PortfolioAW.PorfolioAugustoWernli.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String titulo_rep;
    private String lugar;
    private String nombre;
    private String foto;
    private String fecha;
    private String descripcion;

    public Long getId() {
        return id;
    }

    public String gettitulo_rep() {
        return titulo_rep;
    }    
    public String getlugar() {
        return lugar;
    }
    public String getfoto() {
        return foto;
    }
    public String getnombre() {
        return nombre;
    }
    public String getfecha() {
        return fecha;
    }    
    public String getdescripcion() {
        return descripcion;
    }

    public void settitulo_rep(String titulo_rep) {
        this.titulo_rep = titulo_rep;
    }
    public void setlugar(String lugar) {
        this.lugar = lugar;
    }
    public void setfoto(String foto) {
        this.foto = foto;
    }
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public void setfecha(String fecha) {
        this.fecha = fecha;
    }
    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}