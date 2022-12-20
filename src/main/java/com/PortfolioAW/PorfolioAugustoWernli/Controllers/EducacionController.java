package com.PortfolioAW.PorfolioAugustoWernli.Controllers;
import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.educacion;
import com.PortfolioAW.PorfolioAugustoWernli.Interface.IEducacionService;

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
public class EducacionController {

    @Autowired
    private IEducacionService interEducacion;

    @GetMapping(value = "/Educacion/traer")
    public List<educacion> geteducacion(){
        return interEducacion.geteducacion();
    }

    @PostMapping(value = "/Educacion/crear")
    public String createEducacion(@RequestBody educacion educ) {
        interEducacion.saveeducacion(educ);
        return "La informacion fue creada correctamente, por favor actualice la pagina";
    }

    @DeleteMapping("/Educacion/borrar/{id}")
    public String deleteEducacion (@PathVariable Long id) {
        interEducacion.deleteeducacion(id);
        return "La informacion fue eliminada correctamente, por favor actualice la pagina";
    }


    @PostMapping("/Educacion/editar/{id}")
    public String editEducacion(@RequestBody educacion edc,
                                @PathVariable Long id)
                                {
        educacion educ = interEducacion.findeducacion(id);
        
        String nuevotitulo = edc.gettitulo();
        String nuevotipo = edc.gettipo();
        String nuevolugar = edc.getlugar();
        String nuevologo = edc.getlogo();
        String nuevafecha_inicio = edc.getfecha_inicio();
        String nuevafecha_fin = edc.getfecha_fin();
        educ.settitulo(nuevotitulo);
        educ.settipo(nuevotipo);
        educ.setlugar(nuevolugar);
        educ.setlogo(nuevologo);
        educ.setfecha_inicio(nuevafecha_inicio);
        educ.setfecha_fin(nuevafecha_fin);

        interEducacion.saveeducacion(educ);

        return "Los datos fueron actualizados correctamente, por favor actualice la página";
    }
}