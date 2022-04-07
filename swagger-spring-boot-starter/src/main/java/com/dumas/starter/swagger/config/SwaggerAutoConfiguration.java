package com.dumas.starter.swagger.config;

import com.dumas.starter.swagger.properties.ApiInfoProperties;
import com.dumas.starter.swagger.properties.Contact;
import com.dumas.starter.swagger.properties.DocketProperties;
import com.dumas.starter.swagger.properties.SwaggerProperties;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/07 10:22
 */
@Configuration
//@EnableSwagger2
@EnableOpenApi
@EnableConfigurationProperties(value = {SwaggerProperties.class})
@ConditionalOnProperty(name = "swagger.enable")
public class SwaggerAutoConfiguration {

    @Autowired
    SwaggerProperties properties;

    @Bean
    public Docket createRestApi() {
        DocketProperties docket = properties.getDocket();
        return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo()).enable(properties.getEnable()).groupName(docket.getGroupName()).select()
                .apis(RequestHandlerSelectors.basePackage(docket.getBasePackage()))
                //.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        ApiInfoProperties apiInfo = properties.getApiInfo();
        Contact contact = apiInfo.getContact();
        return new ApiInfoBuilder().title(apiInfo.getTitle()).description(apiInfo.getDescription())
                .termsOfServiceUrl(apiInfo.getTermsOfServiceUrl())
                .contact(new springfox.documentation.service.Contact(contact.getName(), contact.getUrl(), contact.getEmail()))
                .version(apiInfo.getVersion()).license(apiInfo.getLicense()).licenseUrl(apiInfo.getLicenseUrl())
                .build();
    }

}
