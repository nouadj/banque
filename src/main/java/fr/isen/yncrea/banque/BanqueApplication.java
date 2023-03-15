package fr.isen.yncrea.banque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author noureddine.adjou
 *
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class BanqueApplication {

	public static void main(final String[] args) {
		SpringApplication.run(BanqueApplication.class, args);
	}

}
