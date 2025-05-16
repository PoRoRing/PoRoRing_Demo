package Proring.Proring_prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ProringPrototypeApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProringPrototypeApplication.class, args);
	}

}
