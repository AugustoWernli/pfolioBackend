package com.PortfolioAW.PorfolioAugustoWernli.Service;

import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.experiencia;
import com.PortfolioAW.PorfolioAugustoWernli.Interface.IExperienciaService;
import com.PortfolioAW.PorfolioAugustoWernli.Repository.ExperienciaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    private ExperienciaRepository exprepository;

    @Override
    public List<experiencia> getexperiencias(){
        List<experiencia> listaExperiencias = exprepository.findAll();
        return listaExperiencias;
    }

    @Override
    public void saveexperiencia(experiencia exp) {
        exprepository.save(exp);
    }

    @Override
    public void deleteexperiencia(Long id){
        exprepository.deleteById(id);
    }

    @Override
    public experiencia findexperiencia(Long id) {
        experiencia exp = exprepository.findById(id).orElse(null);
        return exp;
    }
}
