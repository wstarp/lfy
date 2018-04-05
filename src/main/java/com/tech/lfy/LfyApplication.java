package com.tech.lfy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tech.lfy.mapper")
public class LfyApplication {

	public static void main(String[] args) {
		SpringApplication.run(LfyApplication.class, args);
	}
}
