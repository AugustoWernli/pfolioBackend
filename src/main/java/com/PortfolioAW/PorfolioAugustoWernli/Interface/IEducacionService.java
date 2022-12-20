package com.PortfolioAW.PorfolioAugustoWernli.Interface;
import org.springframework.stereotype.Service;

import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.educacion;

@Service
public interface IEducacionService {
    public List<educacion> geteducacion();
    
    public void saveeducacion(educacion educ);

    public void deleteeducacion(Long id);

    public educacion findeducacion(Long id);
}
