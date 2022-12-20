package com.PortfolioAW.PorfolioAugustoWernli.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class login {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    //private Long id;
    private String user;
    private String pass;

    public String getuser() {
        return user;
    }    
    public String getpass() {
        return pass;
    }
}