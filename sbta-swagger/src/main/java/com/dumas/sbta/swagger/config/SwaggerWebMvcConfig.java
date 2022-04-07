package com.dumas.sbta.swagger.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author dumas
 * @desc 权限认证处理
 * @date 2022/04/07 15:10
 */
//@Configuration
public class SwaggerWebMvcConfig implements WebMvcConfigurer {

    //@Autowired
    //JWTInterceptor jwtInterceptor;

    /**
     * 过滤器/权限过滤放开
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(jwtInterceptor)
        //        .addPathPatterns("/**")
        //        .excludePathPatterns("/swagger**/**",
        //                "/webjars/**",
        //                "/v3/**",
        //                "/doc.html");
    }

    /**
     * 资源定位
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/doc.html").addResourceLocations("classpath:/META-INF/resources/");
    }
}
