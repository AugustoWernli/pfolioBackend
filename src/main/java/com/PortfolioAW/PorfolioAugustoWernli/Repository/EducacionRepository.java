package com.PortfolioAW.PorfolioAugustoWernli.Repository;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.educacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EducacionRepository extends JpaRepository<educacion, Long>{

}
