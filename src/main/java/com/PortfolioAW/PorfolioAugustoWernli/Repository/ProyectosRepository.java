package com.PortfolioAW.PorfolioAugustoWernli.Repository;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.proyectos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProyectosRepository extends JpaRepository<proyectos, Long>{

}
