package com.info.kisaanApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages={"com.info"})
@EnableWebMvc()
public class Application extends SpringBootServletInitializer{
private static Logger logger=LogManager.getLogger(Application.class);
public Application()
{
	super();
	setRegisterErrorPageFilter(false);
}
protected SpringApplicationBuilder configure(SpringApplicationBuilder springBuilder)
{
	return springBuilder.sources(Application.class);
}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("application started");
		logger.info("Kisaan application started");
		logger.error("Kisaan application started");
		logger.warn("Kisaan application started");
	}
}
