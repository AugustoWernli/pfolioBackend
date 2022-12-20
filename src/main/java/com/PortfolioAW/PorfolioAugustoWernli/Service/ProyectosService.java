package com.PortfolioAW.PorfolioAugustoWernli.Service;

import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.proyectos;
import com.PortfolioAW.PorfolioAugustoWernli.Interface.IProyectosService;
import com.PortfolioAW.PorfolioAugustoWernli.Repository.ProyectosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{
    
    @Autowired
    private ProyectosRepository proyrepository;

    @Override
    public List<proyectos> getproyectos(){
        List<proyectos> listaProyectoss = proyrepository.findAll();
        return listaProyectoss;
    }

    @Override
    public void saveproyecto(proyectos proy) {
        proyrepository.save(proy);
    }

    @Override
    public void deleteproyecto(Long id){
        proyrepository.deleteById(id);
    }

    @Override
    public proyectos findproyecto(Long id) {
        proyectos proy = proyrepository.findById(id).orElse(null);
        return proy;
    }
}
