package com.PortfolioAW.PorfolioAugustoWernli.Interface;
import org.springframework.stereotype.Service;

import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.proyectos;

@Service
public interface IProyectosService {
    public List<proyectos> getproyectos();
    
    public void saveproyecto(proyectos proy);

    public void deleteproyecto(Long id);

    public proyectos findproyecto(Long id);
}
