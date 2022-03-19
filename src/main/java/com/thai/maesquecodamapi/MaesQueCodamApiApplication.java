package com.thai.maesquecodamapi;

import com.thai.maesquecodamapi.src.controller.MaesQueCodamController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = MaesQueCodamController.class)
public class MaesQueCodamApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaesQueCodamApiApplication.class, args);
	}

}
