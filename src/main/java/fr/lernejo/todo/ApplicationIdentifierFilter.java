package fr.lernejo.todo;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Component
public class ApplicationIdentifierFilter {
    private final String uuid;

    public ApplicationIdentifierFilter(){uuid = UUID.randomUUID().toString();}

    
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException{
        ((HttpServletResponse) servletResponse).setHeader("Instance-Id",this.uuid);
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
