package edu.polar.polarconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PolarConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolarConfigServerApplication.class, args);
	}

}
