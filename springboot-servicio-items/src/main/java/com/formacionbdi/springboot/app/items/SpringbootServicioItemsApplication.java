package com.formacionbdi.springboot.app.items;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//Feign: Llamadas REST de forma declarativa.
@EnableFeignClients

//Ribbon: Balanceador de carga entre servicios.
//RibbonClient: Indica a Feign los microservicios con los que conectará
@RibbonClient(name = "servicio-Productos")


@SpringBootApplication
public class SpringbootServicioItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioItemsApplication.class, args);
	}

}
