package com.jguiller.APIGatewayBank.Configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIGatewayBankConfiguration {

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r -> r.path("/clients/**")
							.uri("http://localhost:8801/")
							.id("clientMicroService"))
				.route(r -> r.path("/products/**")
							.uri("http://localhost:8802/")
							.id("productMicroService"))
				.route(r -> r.path("/bankAccounts/**")
							.uri("http://localhost:8803/")
							.id("bankAccountMicroService"))
				.route(r -> r.path("/transactions/**")
							.uri("http://localhost:8804/")
							.id("transactionMicroService"))
				.build();
	}
	
}
