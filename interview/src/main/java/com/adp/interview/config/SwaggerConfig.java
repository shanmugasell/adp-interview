package com.adp.interview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	String basePackage = "com.adp.interview.web.rest";
	
	@Bean
	public Docket productApi() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage(basePackage)).build().apiInfo(metaData());
		return docket;
	}

	private ApiInfo metaData() {
		ApiInfoBuilder ab = new ApiInfoBuilder();
		ApiInfo apiInfo = ab.title("Parking Application Swagger").description("Parking Lot Allotment").contact("shan@adp.com").license("ADP licence").licenseUrl("www.adp.com").version("1.1").build();
		return apiInfo;
	}
}
