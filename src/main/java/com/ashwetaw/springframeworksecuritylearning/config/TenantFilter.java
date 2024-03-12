package com.ashwetaw.springframeworksecuritylearning.config;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;

import java.io.IOException;

/**
 * @author heinhtet_aung
 * @created 3/4/2024
 **/
public class TenantFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

//        String tenantId = request.getHeader("X-Tenant-Id");
//       // boolean hasAccess = isUserAllowed(tenantId);
//        if (true) {
//            filterChain.doFilter(request, response);
//            return;
//        }
        //throw new AccessDeniedException("Access denied");
        throw new CustomAuthenticationException("Custom authonication exception happened !!");
    }
}
