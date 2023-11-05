package com.example.kafkatrain;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

//    @KafkaListener(
//            topics = "topicName",
//            groupId = "korka"
////            topicPattern = "topicName"
//    )
    @KafkaListener(id = "korka", topics = "topicName")
    public void listenTopicName(String message) {
        System.out.println("Received Message in group foo: " + message);
    }
}
