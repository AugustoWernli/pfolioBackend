package com.PortfolioAW.PorfolioAugustoWernli.Service;

import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.mensaje;
import com.PortfolioAW.PorfolioAugustoWernli.Interface.IMensajeService;
import com.PortfolioAW.PorfolioAugustoWernli.Repository.MensajeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class mensajeService implements IMensajeService{
    
    @Autowired
    private MensajeRepository persorepository;

    @Override
    public List<mensaje> getMensajes(){
        List<mensaje> listaMensajes = persorepository.findAll();
        return listaMensajes;
    }

    @Override
    public void saveMensaje(mensaje perso) {
        persorepository.save(perso);
    }

    @Override
    public void deleteMensaje(Long id){
        persorepository.deleteById(id);
    }

    @Override
    public mensaje findMensaje(Long id) {
        mensaje perso = persorepository.findById(id).orElse(null);
        return perso;
    }
}
