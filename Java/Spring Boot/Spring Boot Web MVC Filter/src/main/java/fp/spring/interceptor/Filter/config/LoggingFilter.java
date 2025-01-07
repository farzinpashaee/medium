package fp.spring.interceptor.Filter.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@Component
@Order(1)
public class LoggingFilter implements Filter {

    @Override
    public void init(FilterConfig filterconfig)
            throws ServletException {
        log.info( filterconfig.getFilterName() + " created" );
    }

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain filterchain)
            throws IOException, ServletException {

        UUID uuid = UUID.randomUUID();
        Long start = System.currentTimeMillis();
        request.setAttribute("request-id" , uuid);
        log.info( "{} - remote host {}" , uuid , request.getRemoteHost() );
        filterchain.doFilter(request, response);
        log.info( "{} - response in {}ms",
                uuid,
                System.currentTimeMillis() - start );
    }

    @Override
    public void destroy() {
        log.info( "LoggingFilter destroyed" );
    }

}
