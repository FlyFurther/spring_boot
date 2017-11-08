package com.huangq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication  //是SpringBoot项目的核心注解,开启自动配置
public class DemoApplication {

//	@Value("server.port")
//	private String port;
//
//	@Value("server.context-path")
//	private String contextPath;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "Hello Spring Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		SpringApplication app = new SpringApplication(DemoApplication.class);
//		app.run(args);
//		SpringApplication.run(DemoApplication.class, args);
	}
}
