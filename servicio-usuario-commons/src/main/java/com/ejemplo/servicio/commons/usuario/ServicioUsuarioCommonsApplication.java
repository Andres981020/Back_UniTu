package com.ejemplo.servicio.commons.usuario;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@EntityScan({"com.ejemplo.servicio.commons.rol.models.entity"})
public class ServicioUsuarioCommonsApplication {

}
