package com.bank.account;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@EnableSwagger2
public class AppConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/" + "api" + "/*")
                .addResourceLocations("classpath:/public/");
    }

    @Primary
    @Bean
    public SwaggerResourcesProvider swaggerResourcesProvider() {
        return () -> {
            List<SwaggerResource> resources = new ArrayList<>();
            resources.add(loadResource("/getAccountBalance.yaml"));
            return resources;
        };
    }

    private SwaggerResource loadResource(String resource) {
        SwaggerResource wsResource = new SwaggerResource();
        wsResource.setName("User registration");
        wsResource.setSwaggerVersion("3.0");
        wsResource.setLocation("/" + "api" + resource);
        System.out.println(wsResource);
        return wsResource;
    }
}
