package com.PortfolioAW.PorfolioAugustoWernli.Service;

import java.util.List;

import com.PortfolioAW.PorfolioAugustoWernli.Classes.login;
import com.PortfolioAW.PorfolioAugustoWernli.Interface.IloginService;
import com.PortfolioAW.PorfolioAugustoWernli.Repository.loginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginService implements IloginService{
    
    @Autowired
    private loginRepository logrepository;

    @Override
    public List<login> getlogin(){
        List<login> log = logrepository.findAll();
        return log;
    }
}
