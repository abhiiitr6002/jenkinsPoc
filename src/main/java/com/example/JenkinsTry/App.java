package com.example.JenkinsTry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.example"})
public class App 
{
	static ConfigurableApplicationContext context = null;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		context = SpringApplication.run(App.class, args);
	}
}
