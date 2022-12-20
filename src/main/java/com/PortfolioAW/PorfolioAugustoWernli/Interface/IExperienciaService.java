package com.PortfolioAW.PorfolioAugustoWernli.Interface;
import org.springframework.stereotype.Service;

import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.experiencia;

@Service
public interface IExperienciaService {
    public List<experiencia> getexperiencias();
    
    public void saveexperiencia(experiencia exp);

    public void deleteexperiencia(Long id);

    public experiencia findexperiencia(Long id);
}
