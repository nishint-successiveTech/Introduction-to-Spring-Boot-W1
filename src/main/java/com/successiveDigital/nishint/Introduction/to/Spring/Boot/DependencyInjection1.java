package com.successiveDigital.nishint.Introduction.to.Spring.Boot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DependencyInjection1 implements DependencyInjectionInterface{
    public void getMessage(){
        System.out.println("I am inside DependencyInjection1");
    }
}
