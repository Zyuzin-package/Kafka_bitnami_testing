package com.example.kafkatrain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class Producer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {
        kafkaTemplate.send("topicName", msg);
    }
    @Scheduled(fixedDelay = 5000,initialDelay = 5000 )
    public void test(){
        String uuid= UUID.randomUUID().toString();
        sendMessage("KORKA");
        System.out.println("Produce message: "+ uuid);
    }
}
