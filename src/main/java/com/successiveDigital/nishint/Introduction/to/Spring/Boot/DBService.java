package com.successiveDigital.nishint.Introduction.to.Spring.Boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DBService{

//    Field Injection
//    @Autowired
//    DependencyInjectionInterface dependencyInjectionInterface;


    // Contructor Injection

    final private DependencyInjectionInterface dependencyInjectionInterface;

    public  DBService(DependencyInjectionInterface obj){
        this.dependencyInjectionInterface=obj;
    }

    public void getMessageFromBean(){
        dependencyInjectionInterface.getMessage();
    }
}
