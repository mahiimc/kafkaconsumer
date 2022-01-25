package com.consumer.kafkaconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaconsumerApplication {


	public static void main(String[] args) {
		SpringApplication.run(KafkaconsumerApplication.class, args);
	}

}
