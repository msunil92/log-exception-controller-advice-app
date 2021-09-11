package com.learn.logexp.advice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class LogExceptionControllerAdviceApplication {

    public static void main(String[] args) {
        log.info("Started " + LogExceptionControllerAdviceApplication.class.getSimpleName() + " class");
        SpringApplication.run(LogExceptionControllerAdviceApplication.class, args);
    }

}
