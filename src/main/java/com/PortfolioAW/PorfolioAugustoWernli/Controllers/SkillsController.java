package com.PortfolioAW.PorfolioAugustoWernli.Controllers;

import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.skills;
import com.PortfolioAW.PorfolioAugustoWernli.Interface.ISkillsService;

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
public class SkillsController {

    @Autowired
    private ISkillsService interSkills;

    @GetMapping(value = "/Skills/traer")
    public List<skills> getSkills(){
        return interSkills.getskills();
    }

    @PostMapping(value = "/Skills/crear")
    public String createSkills(@RequestBody skills skill) {
        interSkills.saveskill(skill);
        return "La informacion fue creada correctamente, por favor actualice la pagina";
    }

    @DeleteMapping("/Skills/borrar/{id}")
    public String deleteSkills (@PathVariable Long id) {
        interSkills.deleteskill(id);
        return "La informacion fue eliminada correctamente, por favor actualice la pagina";
    }


    @PostMapping("/Skills/editar/{id}")
    public String editSkills(  @RequestBody skills skl,
                                @PathVariable Long id)
                                {
        skills skill = interSkills.findskill(id);
        
        String nuevoskill =skl.getskill();
        String nuevotitulo_rep =skl.gettitulo_rep();
        int nuevodominio = skl.getdominio();

        skill.setskill(nuevoskill);;
        skill.settitulo_rep(nuevotitulo_rep);
        skill.setdominio(nuevodominio);

        interSkills.saveskill(skill);

        return "Los datos fueron actualizados correctamente, por favor actualice la página";
    }
}