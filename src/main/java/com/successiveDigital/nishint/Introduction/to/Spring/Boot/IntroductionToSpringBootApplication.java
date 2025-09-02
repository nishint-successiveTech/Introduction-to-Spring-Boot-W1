package com.successiveDigital.nishint.Introduction.to.Spring.Boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);
	}

//    @Autowired
//    Nishint ng;  //instead of doing Nishint ng=new Nishint(); we can inject our bean directly into action using @Autowired

    @Autowired
    DBService dbService;

    @Override
    public void run(String... args) throws Exception {
    dbService.getMessageFromBean();
    }
}
