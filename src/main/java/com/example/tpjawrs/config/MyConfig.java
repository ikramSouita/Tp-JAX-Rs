package com.example.tpjawrs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.glassfish.jersey.server.ResourceConfig;

@Configuration
public class MyConfig {

    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(com.example.tpjawrs.controller.CompteRestJaxRSAPI.class);
        return jerseyServlet;
    }
}
