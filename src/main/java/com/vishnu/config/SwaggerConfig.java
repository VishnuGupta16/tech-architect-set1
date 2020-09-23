package com.vishnu.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	public static final Contact DEFAULT_CONTACT = new Contact("Vishnu Gupta", "https://github.com/VishnuGupta16/tech-architect-set1.git", "guptavishnunitsk@gmail.com");

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
        	.apis(RequestHandlerSelectors.basePackage("com.vishnu"))
            .build()
            .apiInfo(apiInfo())
            .useDefaultResponseMessages(false);
    }

    @SuppressWarnings("rawtypes")
	private ApiInfo apiInfo() {
        return new ApiInfo("Api Documentation For The Movie Application", "Api Documentation For The Movie Application", "1.0", "https://github.com/VishnuGupta16/tech-architect-set1/blob/master/README.md",
                DEFAULT_CONTACT, "Freedom 1.0", "https://github.com/VishnuGupta16/tech-architect-set1/blob/master/README.md", new ArrayList<VendorExtension>());
    }
}
