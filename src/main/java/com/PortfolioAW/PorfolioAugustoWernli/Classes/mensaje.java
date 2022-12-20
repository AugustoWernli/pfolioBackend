package com.PortfolioAW.PorfolioAugustoWernli.Classes;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String empresa;
    private String contenido;

    public String getnombre() {
        return nombre;
    }    
    public String getempresa() {
        return empresa;
    }
    public String getcontenido() {
        return contenido;
    }
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public void setempresa(String empresa) {
        this.empresa = empresa;
    }
    public void setcontenido(String contenido) {
        this.contenido = contenido;
    }

}