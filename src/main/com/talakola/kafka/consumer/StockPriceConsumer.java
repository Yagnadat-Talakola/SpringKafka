package com.talakola.kafka.consumer;

import com.talakola.kafka.config.KafkaConsumerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class StockPriceConsumer {

    @Autowired
    private KafkaConsumerConfig kafkaConsumerConfig;

    @PostConstruct
    void print() {
        System.out.println(kafkaConsumerConfig);
    }
}
