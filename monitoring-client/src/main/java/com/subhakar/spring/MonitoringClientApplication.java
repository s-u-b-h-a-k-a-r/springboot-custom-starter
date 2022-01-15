package com.subhakar.spring;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@AllArgsConstructor
public class MonitoringClientApplication {
    CustomStarter customStarter;

    public static void main(String[] args) {
        SpringApplication.run(MonitoringClientApplication.class, args);
    }


    @Bean
    public CommandLineRunner run() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                customStarter.start();
                customStarter.execute();
                customStarter.stop();
            }
        };
    }
}
