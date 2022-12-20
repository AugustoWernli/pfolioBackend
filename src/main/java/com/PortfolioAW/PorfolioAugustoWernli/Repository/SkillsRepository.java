package com.PortfolioAW.PorfolioAugustoWernli.Repository;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.skills;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SkillsRepository extends JpaRepository<skills, Long>{

}
