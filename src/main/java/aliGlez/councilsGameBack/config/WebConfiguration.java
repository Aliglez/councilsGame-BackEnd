package aliGlez.councilsGameBack.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


public class WebConfiguration implements WebMvcConfigurer{

    @Value (value = "${api-endpoint}/**")
    private String baseUrl;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler(baseUrl)
                .addResourceLocations("/static/images", "classpath:/static/images");
                
    }
    
}