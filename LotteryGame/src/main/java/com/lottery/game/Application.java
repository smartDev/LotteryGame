package com.lottery.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Tauheed yar khan
 */
@SpringBootApplication
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
