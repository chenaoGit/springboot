package com.cywx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cywx.**.dao")
public class SpringbootDubboServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboServiceApplication.class, args);
	}
}
