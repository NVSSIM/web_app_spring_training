package fr.lernejo.todo;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Component
public class ApplicationIdentifierFilter {
    private final String instanceID = UUID.randomUUID().toString();

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException{
        HttpServletResponse resp = (HttpServletResponse) response;
        resp.setHeader("Instance-ID",instanceID);
    }


}
