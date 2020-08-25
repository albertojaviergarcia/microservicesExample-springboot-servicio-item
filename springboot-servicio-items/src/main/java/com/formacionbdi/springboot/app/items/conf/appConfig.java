package com.formacionbdi.springboot.app.items.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class appConfig {

	@Bean("clienteRest")
	@LoadBalanced //Usa Ribbon para balancear de manera automática la carga
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}
	
}
