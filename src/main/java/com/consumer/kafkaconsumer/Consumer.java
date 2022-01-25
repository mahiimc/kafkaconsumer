package com.consumer.kafkaconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    private  static final Logger log = LoggerFactory.getLogger(KafkaconsumerApplication.class);
    @KafkaListener(topics = "test",groupId = "group_id")
    public void consume(String message){
        log.info("Consumed Message : {}",message);
    }
}
