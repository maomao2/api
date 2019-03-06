package com.kwgproperty.server.dataworker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class
})
@EnableCaching
@EnableAsync
@ServletComponentScan
@MapperScan("com.kwgproperty.server.dataworker.mapper")
public class DataWorkerApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DataWorkerApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

}
