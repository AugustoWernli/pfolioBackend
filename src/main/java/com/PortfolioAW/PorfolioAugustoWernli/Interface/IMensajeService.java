package com.PortfolioAW.PorfolioAugustoWernli.Interface;
import org.springframework.stereotype.Service;

import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.mensaje;

@Service
public interface IMensajeService {
    public List<mensaje> getMensajes();
    
    public void saveMensaje(mensaje msg);

    public void deleteMensaje(Long id);

    public mensaje findMensaje(Long id);
}
