package in.sujal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.sujal.Engin;

@Configuration	//to represent java class as a configuration class instead of xml
@ComponentScan(basePackages="in.sujal")
public class AppConfig {
	
	@Bean
	public Engin getEngin() {
		Engin eng = new Engin();
		return eng;
	}
	
	public AppConfig() {
		System.out.println("AppConfig-Constructor");
	}

}
