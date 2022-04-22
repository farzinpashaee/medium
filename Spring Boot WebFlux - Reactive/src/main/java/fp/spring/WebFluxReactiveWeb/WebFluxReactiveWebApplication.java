package fp.spring.WebFluxReactiveWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories
public class WebFluxReactiveWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFluxReactiveWebApplication.class, args);
	}

}
