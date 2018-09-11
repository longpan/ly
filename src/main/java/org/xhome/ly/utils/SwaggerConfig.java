package org.xhome.ly.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SecurityConfiguration;
//import springfox.documentation.swagger.web.SecurityConfigurationBuilder;
import springfox.documentation.swagger.web.SecurityConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.google.common.collect.Lists.newArrayList;

@Configuration
@EnableSwagger2
@EnableWebMvc
@ComponentScan(basePackages = {"org.xhome.ly.action"})
public class SwaggerConfig {
//    @Bean
//    public Docket customDocket() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build();
//    }any

    private ApiInfo apiInfo() {
        Contact contact = new Contact("支付组", "", "");
        return new ApiInfoBuilder()
                .title("支付API接口")
                .description("支付API接口")
                .contact(contact)
                .version("1.1.0")
                .build();
    }

    @Bean
    public Docket parkingReservationServiceApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.regex("/.*"))
                .build().pathMapping("/")
                .directModelSubstitute(LocalDate.class, String.class)
                .genericModelSubstitutes(ResponseEntity.class)
//                .alternateTypeRules(newRule(typeResolver.resolve(DeferredResult.class, typeResolver.resolve(ResponseEntity.class, WildcardType.class)), typeResolver.resolve(WildcardType.class)))
                .useDefaultResponseMessages(true)
                .globalResponseMessage(RequestMethod.GET,
                        newArrayList(new ResponseMessageBuilder()
                                .code(500)
                                .message("500 message")
                                .responseModel(new ModelRef("Error"))
                                .build()))
                .apiInfo(apiInfo())
                .securitySchemes(newArrayList(apiKey()))
                /*.securityContexts(newArrayList(securityContext()))*/
                .protocols(protocols())
                .securitySchemes(securitySchemes())
                .securityContexts(securityContexts());
    }

    @Bean
    SecurityConfiguration security() {
//        return new SecurityConfiguration("clientId", "clientSecret", "realm", "appName", "apiKey11111",)
        return SecurityConfigurationBuilder.builder()
                .clientId("test-app-client-id")
                .clientSecret("test-app-client-secret")
                .realm("test-app-realm")
                .appName("test-app")
                .scopeSeparator(",")
                .additionalQueryStringParams(null)
                .useBasicAuthenticationWithAccessCodeGrant(false)
                .build();
    }

    private ApiKey apiKey() {
        return new ApiKey("abcdef12345", "api_key", "header");
    }

/*    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences(defaultAuth())
                .forPaths(PathSelectors.regex("/c2creservation.*")).build();
    }*/

    List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope(
                "global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[0];
//        authorizationScopes[0] = authorizationScope;
        return newArrayList(new SecurityReference("abcdef12345", authorizationScopes));
    }


    private List<SecurityContext> securityContexts() {
        List<SecurityContext> securityContexts   = Arrays.asList(SecurityContext.builder().forPaths(PathSelectors.regex("/.*")).securityReferences(defaultAuth()).build());
        return securityContexts;
    }

    private List<? extends SecurityScheme> securitySchemes() {
        List<ApiKey> authorizationTypes = Arrays.asList(new ApiKey("abcdef12345", "api_key", "header"));
        return authorizationTypes;
    }

    private Set<String> protocols() {
        Set<String> protocols = new HashSet<>();
        protocols.add("http");
        protocols.add("https");
        return protocols;
    }

}


