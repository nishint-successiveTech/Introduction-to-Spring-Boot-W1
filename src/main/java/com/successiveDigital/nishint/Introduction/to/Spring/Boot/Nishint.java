package com.successiveDigital.nishint.Introduction.to.Spring.Boot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Nishint {

    public void hello(){
        System.out.println("HI i am inside Nishint class");
    }

    @PostConstruct  // this will run when bean is initalized ,listen when initalized not injected ,Initalized mean when start the application all beann initialized so it will run no matter this class is used or not anywhere
    public void callThisAfterBeanIsInitalized(){
        System.out.println("Hi bean is initalized");
    }

    @PreDestroy
    public void callThisBeforeBeanDestroy(){
        System.out.println("Bean message before destroying");
    }



}
