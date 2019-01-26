package com.talakola.kafka.consumer;

import com.talakola.kafka.config.KafkaConsumerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class StockPriceConsumer {

    @Autowired
    private KafkaConsumerConfig kafkaConsumerConfig;

    @Value("${kafka.consumer.stock.topic}")
    String topicName;

    @PostConstruct
    void print() {
        System.out.println("loaded from value annotation: " + topicName);
        System.out.println(kafkaConsumerConfig);
    }
}
