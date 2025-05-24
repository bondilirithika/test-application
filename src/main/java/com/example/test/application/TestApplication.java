package com.example.test.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.zenvinnovations.google_sso_auth_starter.config.GoogleSsoAuthAutoConfiguration;

@SpringBootApplication
@Import(GoogleSsoAuthAutoConfiguration.class) // Explicitly import auto-configuration
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}