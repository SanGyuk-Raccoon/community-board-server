package com.raccoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.raccoon.**"})
public class CommunityBoardServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunityBoardServerApplication.class, args);
	}

}
