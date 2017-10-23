package com.cliporganizer;

import com.cliporganizer.Security.WebSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * Created by Mainul35 on 2/26/2017.
 */
@ComponentScan(basePackages = {
        "com.cliporganizer.model",
        "com.cliporganizer.Controller",
        "com.cliporganizer.Service",
        "com.cliporganizer.Repository",
        "com.cliporganizer"})

@EnableAutoConfiguration
@Import({WebSecurityConfig.class})
@SpringBootApplication(exclude = {com.cliporganizer.MysqlConfig.class})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}