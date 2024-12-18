package com.ennbi.VecureDiscoveryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class VecureDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VecureDiscoveryServiceApplication.class, args);
	}

}
