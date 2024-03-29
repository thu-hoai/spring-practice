package com.auth.lib.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.web.client.RestTemplate;

@Configuration
@Profile("!local")
public class JwtDecoderConfig extends ResouceServerConfig {

    @Bean
    public RestTemplate restTemplate() {return new RestTemplate();}

    @Bean
    public JwtDecoder jwtDecoder() {return getJwtDecoder(restTemplate());}
}
