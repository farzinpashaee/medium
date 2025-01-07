package fp.spring.interceptor.Filter.config;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
public class HeaderProcessFilter implements Filter {

    @Override
    public void init(FilterConfig filterconfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain filterchain) throws IOException, ServletException {

        log.info( "{} - header process" , request.getAttribute("request-id" ) );
        filterchain.doFilter(request, response);
    }

    @Override
    public void destroy() {}


}
