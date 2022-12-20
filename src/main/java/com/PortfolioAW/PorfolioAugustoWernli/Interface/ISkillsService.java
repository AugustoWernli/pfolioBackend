package com.PortfolioAW.PorfolioAugustoWernli.Interface;
import org.springframework.stereotype.Service;

import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.skills;

@Service
public interface ISkillsService {
    public List<skills> getskills();
    
    public void saveskill(skills skill);

    public void deleteskill(Long id);

    public skills findskill(Long id);
}
