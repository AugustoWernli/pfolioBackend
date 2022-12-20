package com.PortfolioAW.PorfolioAugustoWernli.Repository;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.mensaje;

//import com.portfolioaw.pfolioaw.Mensaje.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MensajeRepository extends JpaRepository<mensaje, Long>{

}

//public interface MensajeRepository extends JpaRepository<Mensaje, Long>{
//}
