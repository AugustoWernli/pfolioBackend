package com.PortfolioAW.PorfolioAugustoWernli.Controllers;

import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.mensaje;
import com.PortfolioAW.PorfolioAugustoWernli.Interface.IMensajeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensajeController {

    @Autowired
    private IMensajeService interMensaje;

    @GetMapping(value = "/Mensajes/traer")
    public List<mensaje> getMensajes(){
        return interMensaje.getMensajes();
    }

    @PostMapping(value = "/Mensajes/crear")
    public String createMensaje(@RequestBody mensaje msg) {
        interMensaje.saveMensaje(msg);
        return "El mensaje fue creado correctamente, gracias!";
    }

    @DeleteMapping("/Mensajes/borrar/{id}")
    public String deleteMensaje (@PathVariable Long id) {
        interMensaje.deleteMensaje(id);
        return "El mensaje fue eliminado correctamente";
    }


    @PostMapping("/Mensajes/editar/{id}")
    public String editMensaje(@RequestBody mensaje mensg,
                                @PathVariable Long id)
                                {
        mensaje msg = interMensaje.findMensaje(id);

        String nuevaempresa = mensg.getempresa();
        String nuevonombre = mensg.getnombre();
        String nuevocontenido = mensg.getcontenido();

        msg.setempresa(nuevaempresa);;
        msg.setnombre(nuevonombre);
        msg.setcontenido(nuevocontenido);

        interMensaje.saveMensaje(msg);

        return "El mensaje fue modificado correctamente";
    }
}