package com.swcamp.jenkins.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                /* NodePort에 설정된 30000번 포트에서 오는 연결에 대한 CORS설정 해제 */
                .allowedOrigins("http://localhost:30000")
                .allowedMethods("GET",  "POST", "PUT", "DELETE", "PATCH", "OPTIONS");
    }
}
