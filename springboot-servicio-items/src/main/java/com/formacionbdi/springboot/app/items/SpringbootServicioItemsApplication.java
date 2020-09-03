package com.formacionbdi.springboot.app.items;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//Feign: Llamadas REST de forma declarativa.
@EnableFeignClients
@EnableEurekaClient

//Ribbon: Balanceador de carga entre servicios. No necesario con eureka
//RibbonClient: Indica a Feign los microservicios con los que conectará
//@RibbonClient(name = "servicio-Productos")


//Hystrix: Habilita el control de gestión de errores
@EnableCircuitBreaker

@SpringBootApplication
public class SpringbootServicioItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioItemsApplication.class, args);
	}

}
