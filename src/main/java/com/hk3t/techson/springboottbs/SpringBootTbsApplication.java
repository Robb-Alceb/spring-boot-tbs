package com.hk3t.techson.springboottbs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hk3t.techson.springboottbs.mapper")
public class SpringBootTbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTbsApplication.class, args);
	}
}
