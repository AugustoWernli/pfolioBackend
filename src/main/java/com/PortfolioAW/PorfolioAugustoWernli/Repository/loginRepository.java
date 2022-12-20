package com.PortfolioAW.PorfolioAugustoWernli.Repository;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface loginRepository extends JpaRepository<login, Long>{
}
