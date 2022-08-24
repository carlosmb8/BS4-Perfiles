package com.example.bs4perfiles;

import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Data
@Component
@Profile("perfil1")
public class Perfil1 implements Perfiles{

    private String perfil = "perfil1";

    @Override
    public void miFuncion() {
        System.out.println(perfil);
    }
}
