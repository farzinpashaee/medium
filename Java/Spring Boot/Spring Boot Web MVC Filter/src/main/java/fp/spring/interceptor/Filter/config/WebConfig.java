package fp.spring.interceptor.Filter.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public FilterRegistrationBean<HeaderProcessFilter> headerProcessFilter(){
        FilterRegistrationBean<HeaderProcessFilter> registrationBean
                = new FilterRegistrationBean<>();
        registrationBean.setFilter(new HeaderProcessFilter());
        registrationBean.addUrlPatterns("/student/*");
        registrationBean.setOrder(3);
        return registrationBean;
    }

}
