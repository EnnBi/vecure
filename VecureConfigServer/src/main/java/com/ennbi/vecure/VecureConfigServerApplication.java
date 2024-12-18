package com.ennbi.vecure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class VecureConfigServerApplication {

	public static void main(String[] args) {
		System.err.println("-----Starting Vault Server--------");
		SpringApplication.run(VecureConfigServerApplication.class, args);
	}

}
