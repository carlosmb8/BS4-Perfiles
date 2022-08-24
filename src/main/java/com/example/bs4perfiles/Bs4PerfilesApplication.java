package com.example.bs4perfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Configuration
public class Bs4PerfilesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Bs4PerfilesApplication.class, args);
    }

    @Autowired
    MisPropiedades propiedades;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("valor1: " + propiedades.getValor1() + " valor2: " + propiedades.getValor2());
    }
}
