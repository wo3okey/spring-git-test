package com.example.cleanspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CleanSpringApplication {

    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("나도 어떤 작업함");
        SpringApplication.run(CleanSpringApplication.class, args);
    }

}
