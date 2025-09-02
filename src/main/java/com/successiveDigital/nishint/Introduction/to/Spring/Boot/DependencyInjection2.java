package com.successiveDigital.nishint.Introduction.to.Spring.Boot;

import org.springframework.stereotype.Component;

@Component
public class DependencyInjection2  implements DependencyInjectionInterface{
    public void getMessage(){
        System.out.println("I am inside DependencyInjection2");
    }
}
