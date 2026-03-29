package springApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

	@Bean
	@Primary
	Parrot parrot1() {
		Parrot p = new Parrot();
		p.setName("Koko");
		return p;
	}
	
	@Bean (name = "Miki")
	Parrot parrot2() {
		Parrot p = new Parrot();
		p.setName("Miki");
		return p;
	}
	
	@Bean(value = "Riki")
	Parrot parrot3() {
		Parrot p = new Parrot();
		p.setName("Riki");
		return p;
	}
}
