package fp.spring.interceptor.WebMvcInterceptor.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor( new LogInterceptor() ).order(1);
        registry.addInterceptor( new AuthenticationInterceptor() ).order(2);
    }

}
