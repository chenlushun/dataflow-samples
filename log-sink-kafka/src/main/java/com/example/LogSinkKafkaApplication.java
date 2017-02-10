package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding({Sink.class})
public class LogSinkKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogSinkKafkaApplication.class, args);
    }

    @StreamListener(Sink.INPUT)
    public void log(String payload) {
        System.out.println(payload);
    }
}
