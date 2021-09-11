package com.learn.logexp.advice.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sunil
 * @project log-exception-controller-advice-app
 * @created 2021/09/10 6:06 PM
 */
@Configuration
public class OpenAPIDocsConfig {

    @Value("${springdoc.title}")
    private String title;
    @Value("${springdoc.description}")
    private String description;
    @Value("${springdoc.version}")
    private String version;


    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
            .info(new Info().description("")
            .title(title)
            .version(version)
            .description(description)
            .termsOfService("http://swagger.io/terms/")
            .license(new License().name("Apache 2.0").url("http://springdoc.org")));

    }
}
