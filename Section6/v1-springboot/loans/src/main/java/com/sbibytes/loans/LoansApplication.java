package com.sbibytes.loans;

import com.sbibytes.loans.dto.LoansContactInfoDto;
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
/*@ComponentScans({ @ComponentScan("com.sbbytes.loans.controller") })
@EnableJpaRepositories("com.sbbytes.loans.repository")
@EntityScan("com.sbbytes.loans.model")*/
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "SBIBank Loans microservice REST API Documentation",
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
				description = "SBIBank Loans microservice REST API Documentation",
				url = "https://www.sbbytes.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
