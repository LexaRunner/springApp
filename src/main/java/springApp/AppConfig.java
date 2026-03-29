package springApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	Parrot parrot() {
		Parrot p = new Parrot();
		p.setName("Koko");
		return p;
	}
	
	@Bean
	String hello() {
		return "Hello";
	}
	
	@Bean
	Integer ten() {
		return 10;
	}
}
