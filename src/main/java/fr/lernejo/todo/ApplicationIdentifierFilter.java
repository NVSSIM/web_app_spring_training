package fr.lernejo.todo;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Component
public class ApplicationIdentifierFilter implements Filter{
    private final String instanceID;

    public ApplicationIdentifierFilter(){
        instanceID = UUID.randomUUID().toString();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
        ((HttpServletResponse) response).setHeader("Instance-ID", instanceID);
        chain.doFilter(request, response);
    }
}
