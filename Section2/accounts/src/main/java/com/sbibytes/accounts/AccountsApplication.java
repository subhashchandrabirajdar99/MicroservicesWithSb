package com.sbibytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScan({@ComponentScan("com.SBIBytes.accounts.controller)})
@EnableJpaRepository("com.SBIBytes.accounts.repository")
@EntityScan("com.SBIBytes.accounts.model") */
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts microservice REST API Documentation",
                description = "SBIBank Accounts microservices REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Subhash B",
                        email = "Subha@gmail.com",
                        url = "https://www.google.com"
                ),
                license = @License(
                        name="Apache 2.0",
                        url="https://www.sbi.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "SBIBank Accounts microservice REST API Documentation",
                url="https://www.easybytes.com/swagger-ui.html"
        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
