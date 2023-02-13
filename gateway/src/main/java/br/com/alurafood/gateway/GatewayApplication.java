package br.com.alurafood.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
// o gateway é uma forma de fazer a conexão com o servidor através de uma única porta, uma vez que cada microservice tem uma porta distinta
// um ponto negativo seria que caso esse gateway esteja down, toda a aplicação será desconectada, logo o mesmo deve ter uma atenção especial.
@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}

//test
