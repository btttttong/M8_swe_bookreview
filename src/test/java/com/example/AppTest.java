package com.example;

import com.example.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppTest {

    @Test
    void testSpringContextLoads() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        assertNotNull(context, "Spring Context should be initialized");
    }
}