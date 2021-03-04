package com.lfh.hospital.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description:
   http://localhost:8088/swagger-ui.html#/
 * @author: LFH
 * @date: 2021/3/4
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    // 配置swagger页面的头部
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Community's SpringBoot APIs")            // 配置页面的标题
                .description("这里是Smart Community的swagger页面")      // 配置页面的简介
                .contact(new Contact("LFH",          // 配置页面联系，包括姓名，url，email
                        "",
                        "2448808186@qq.com"))
                .version("1.0")                               // 配置页面的版本
                .build();
    }
}
