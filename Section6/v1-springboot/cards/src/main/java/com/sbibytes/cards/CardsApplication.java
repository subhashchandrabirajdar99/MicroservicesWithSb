package com.sbibytes.cards;

import com.sbibytes.cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.sbbytes.cards.controller") })
@EnableJpaRepositories("com.sbbytes.cards.repository")
@EntityScan("com.sbbytes.cards.model")*/
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "SBIBank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Subhash Birajdar",
						email = "tutor@sbbytes.com",
						url = "https://www.sbbytes.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.sbbytes.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "SBIBank Cards microservice REST API Documentation",
				url = "https://www.sbbytes.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
