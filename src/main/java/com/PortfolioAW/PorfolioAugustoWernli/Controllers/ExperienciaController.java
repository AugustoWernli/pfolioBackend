package com.PortfolioAW.PorfolioAugustoWernli.Controllers;

import java.sql.Blob;
import java.sql.Date;
import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.experiencia;
import com.PortfolioAW.PorfolioAugustoWernli.Interface.IExperienciaService;

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
public class ExperienciaController {

    @Autowired      
    private IExperienciaService interExperiencia;

    @GetMapping(value = "/Experiencia/traer")
    public List<experiencia> getExperiencia(){
        return interExperiencia.getexperiencias();
    }

    @PostMapping(value = "/Experiencia/crear")
    public String createExperiencia(@RequestBody experiencia exp) {
        interExperiencia.saveexperiencia(exp);
        return "La informacion fue creada correctamente, por favor actualice la página";
    }

    @DeleteMapping("/Experiencia/borrar/{id}")
    public String deleteExperiencia (@PathVariable Long id) {
        interExperiencia.deleteexperiencia(id);
        return "La informacion fue elimina da correctamente, por favor actualice la página";
    }


    @PostMapping("/Experiencia/editar/{id}")
    public String editexperiencia(@RequestBody experiencia exps,
                                @PathVariable Long id)
                                {
        experiencia exp = interExperiencia.findexperiencia(id);

        String nuevaempresa = exps.getempresa();
        String nuevotitulo = exps.gettitulo();
        String nuevologo = exps.getlogo();
        String nuevafecha_inicio = exps.getfecha_inicio();
        String nuevafecha_fin = exps.getfecha_fin();
        String nuevadescripcion = exps.getdescripcion();
        String nuevoprograma = exps.getprogramas();

        exp.setempresa(nuevaempresa);
        exp.settitulo(nuevotitulo);
        exp.setlogo(nuevologo);
        exp.setfecha_inicio(nuevafecha_inicio);
        exp.setfecha_fin(nuevafecha_fin);
        exp.setdescripcion(nuevadescripcion);
        exp.setprogramas(nuevoprograma);

        interExperiencia.saveexperiencia(exp);

        return "Los datos fueron actualizados correctamente, por favor actualice la página";
    }
}