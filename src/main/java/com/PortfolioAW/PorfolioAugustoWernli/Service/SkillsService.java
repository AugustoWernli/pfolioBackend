package com.PortfolioAW.PorfolioAugustoWernli.Service;

import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.skills;
import com.PortfolioAW.PorfolioAugustoWernli.Interface.ISkillsService;
import com.PortfolioAW.PorfolioAugustoWernli.Repository.SkillsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService{
    
    @Autowired
    private SkillsRepository skillrepository;

    @Override
    public List<skills> getskills(){
        List<skills> listaSkills = skillrepository.findAll();
        return listaSkills;
    }

    @Override
    public void saveskill(skills skill) {
        skillrepository.save(skill);
    }

    @Override
    public void deleteskill(Long id){
        skillrepository.deleteById(id);
    }

    @Override
    public skills findskill(Long id) {
        skills skill = skillrepository.findById(id).orElse(null);
        return skill;
    }
}
