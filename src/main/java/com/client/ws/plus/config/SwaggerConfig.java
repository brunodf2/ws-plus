package com.client.ws.plus.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("WS-PLUS API Documentation")
                        .version("1.0")
                        .description("Documentação da API com Swagger usando Springdoc OpenAPI"));
    }
}
