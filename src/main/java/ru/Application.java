package ru;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Dmitry Tkachenko
 * 11.01.18
 */
@SpringBootApplication
@MapperScan("ru")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
