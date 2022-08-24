package com.example.bs4perfiles;

import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Data
@Component
@Profile("perfil2")
public class Perfil2 implements Perfiles{
    private String perfil = "perfil2";

    @Override
    public void miFuncion() {
        System.out.println(perfil);
    }
}
