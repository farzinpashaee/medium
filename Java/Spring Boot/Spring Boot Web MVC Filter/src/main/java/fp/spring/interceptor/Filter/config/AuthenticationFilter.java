package fp.spring.interceptor.Filter.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@Component
@Order(2)
public class AuthenticationFilter implements Filter {

    @Override
    public void init(FilterConfig filterconfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain filterchain)
            throws IOException, ServletException {

        log.info( "{} - authenticating" ,
                request.getAttribute("request-id" ) );
        filterchain.doFilter(request, response);
    }

    @Override
    public void destroy() {}

}
