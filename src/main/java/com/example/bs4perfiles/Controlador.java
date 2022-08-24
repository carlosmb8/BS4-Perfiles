package com.example.bs4perfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

//    @Value("${url}")
//    String url;
//
//    @Value("${password}")
//    String password;
//
//
//
//    @GetMapping("/parametros")
//    public String muestraParametros(){
//        return "url: " + url + " password: " + password;
//    }


    @Autowired
    MisPropiedades propiedades;

    @GetMapping("/miconfiguración")
    public String muestraValores(){
        return "valor1: " + propiedades.getValor1() + " valor2: " + propiedades.getValor2();
    }

    @Autowired
    Perfiles perfiles;

    @GetMapping("perfil")
    public void muestraPerfil(){
        perfiles.miFuncion();
    }
}
