package com.PortfolioAW.PorfolioAugustoWernli.Service;

import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.educacion;
import com.PortfolioAW.PorfolioAugustoWernli.Interface.IEducacionService;
import com.PortfolioAW.PorfolioAugustoWernli.Repository.EducacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    private EducacionRepository educrepository;

    @Override
    public List<educacion> geteducacion(){
        List<educacion> listaEducacion = educrepository.findAll();
        return listaEducacion;
    }

    @Override
    public void saveeducacion(educacion educ) {
        educrepository.save(educ);
    }

    @Override
    public void deleteeducacion(Long id){
        educrepository.deleteById(id);
    }

    @Override
    public educacion findeducacion(Long id) {
        educacion educ = educrepository.findById(id).orElse(null);
        return educ;
    }
}
