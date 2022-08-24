package com.example.bs4perfiles;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Data
@PropertySource("miconfiguracion.properties")
public class MisPropiedades {
    @Value("${valor1}")
    private String valor1;
    @Value("${valor2}")
    private String valor2;

}
