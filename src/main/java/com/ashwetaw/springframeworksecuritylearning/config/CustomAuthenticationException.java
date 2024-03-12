package com.ashwetaw.springframeworksecuritylearning.config;

import org.springframework.security.core.AuthenticationException;

/**
 * @author heinhtet_aung
 * @created 3/4/2024
 **/
public class CustomAuthenticationException extends AuthenticationException {
    public CustomAuthenticationException(String msg) {
        super(msg);
    }
}
