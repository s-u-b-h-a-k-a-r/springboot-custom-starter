package com.subhakar.spring;

import com.subhakar.spring.annotations.LogMethodExecutionTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Slf4j
@Component
public class CustomStarter {
    @LogMethodExecutionTime
    void start() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(2).toMillis());
    }

    @LogMethodExecutionTime
    void execute() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(2).toMillis());
    }

    @LogMethodExecutionTime
    void stop() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(2).toMillis());
    }
}
