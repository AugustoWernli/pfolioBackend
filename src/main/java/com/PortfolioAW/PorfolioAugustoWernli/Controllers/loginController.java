package com.PortfolioAW.PorfolioAugustoWernli.Controllers;

import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.login;
import com.PortfolioAW.PorfolioAugustoWernli.Interface.IloginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {

    @Autowired
    private IloginService interlogin;

    @PostMapping("/login")
    public String login(@RequestBody login lg){

        List<login> lgn= interlogin.getlogin();
        String lguser = lg.getuser();
        String lgpass = lg.getpass();

        for (login other : lgn) {
            String lgnuser = other.getuser();
            String lgnpass = other.getpass();
            if(lgnuser.equals(lguser) && lgnpass.equals(lgpass)){
                return "SUCCESS";
            }

        }
        return "FAILURE";
    }
}
