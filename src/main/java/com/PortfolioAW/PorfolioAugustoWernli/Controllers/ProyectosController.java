package com.PortfolioAW.PorfolioAugustoWernli.Controllers;

import java.sql.Blob;
import java.sql.Date;
import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.proyectos;
import com.PortfolioAW.PorfolioAugustoWernli.Interface.IProyectosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "https://hostingportfolio-1cc53.web.app")
@RestController
public class ProyectosController {

    @Autowired      
    private IProyectosService interProyectos;

    @GetMapping(value = "/Proyectos/traer")
    public List<proyectos> getProyectos(){
        return interProyectos.getproyectos();
    }

    @PostMapping(value = "/Proyectos/crear")
    public String createProyectos(@RequestBody proyectos proy) {
        interProyectos.saveproyecto(proy);
        return "La informacion fue creada correctamente, por favor actualice la pagina";
    }

    @DeleteMapping("/Proyectos/borrar/{id}")
    public String deleteProyectos (@PathVariable Long id) {
        interProyectos.deleteproyecto(id);
        return "La informacion fue eliminada correctamente, por favor actualice la pagina";
    }


    @PostMapping("/Proyectos/editar/{id}")
    public String editProyectos(@RequestBody proyectos proyec,
                                    @PathVariable Long id)
                                {
        proyectos proy = interProyectos.findproyecto(id);
        
        String nuevolugar = proyec.getlugar();
        String nuevotitulo_rep = proyec.gettitulo_rep();
        String nuevofoto = proyec.getfoto();
        String nuevafecha = proyec.getfecha();
        String nuevonombre = proyec.getnombre();
        String nuevadescripcion = proyec.getdescripcion();

        proy.setlugar(nuevolugar);;
        proy.settitulo_rep(nuevotitulo_rep);
        proy.setfoto(nuevofoto);
        proy.setfecha(nuevafecha);
        proy.setnombre(nuevonombre);
        proy.setdescripcion(nuevadescripcion);

        interProyectos.saveproyecto(proy);

        return "Los datos fueron actualizados correctamente, por favor actualice la página";
    }
}