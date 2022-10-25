package RestApi.config;

import static springfox.documentation.builders.PathSelectors.regex;

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
public class Config {
	
	@Bean
	   public Docket api()
	   {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("RestApi"))
				.paths(regex("/swag.*"))
				.build()
				.apiInfo(metadata());
	   }
	

	private ApiInfo metadata() {
		return new ApiInfoBuilder().title("Swagger Used In Spring Boot")
				.description("Testing Swagger Is Working In Spring Boot ?")
				.termsOfServiceUrl("http://google.com")
				.version("1.0").build();
	}
	

}
