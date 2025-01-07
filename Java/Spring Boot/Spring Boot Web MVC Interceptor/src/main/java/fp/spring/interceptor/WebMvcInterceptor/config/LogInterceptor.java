package fp.spring.interceptor.WebMvcInterceptor.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@Slf4j
public class LogInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        UUID uuid = UUID.randomUUID();
        request.setAttribute("start" , System.currentTimeMillis());
        request.setAttribute("request-id", uuid );
        log.info( "{} - calling {}" , uuid , request.getRequestURI() );
        return true;
    }

    @Override
    public void postHandle( HttpServletRequest request,
                            HttpServletResponse response,
                            Object handler,
                            ModelAndView modelAndView) throws Exception {
        log.info( "{} - response in {}ms",
                request.getAttribute("request-id"),
                System.currentTimeMillis() - (long) request.getAttribute("start") );
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler,
                                Exception exception) throws Exception {
        log.info( "{} - completed in {}ms",
                request.getAttribute("request-id"),
                System.currentTimeMillis() - (long) request.getAttribute("start") );
    }
}
