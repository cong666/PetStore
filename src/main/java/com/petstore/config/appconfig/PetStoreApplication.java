package com.petstore.config.appconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication(scanBasePackages={"com.petstore"})
@EnableDiscoveryClient
public class PetStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetStoreApplication.class, args);
	}
}
