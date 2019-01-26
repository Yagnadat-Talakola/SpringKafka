package com.talakola.kafka.consumer;

import com.talakola.kafka.config.KafkaProducerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class StockPriceProducer {

    @Autowired
    KafkaProducerConfig kafkaProducerConfig;

    @PostConstruct
    public void print() {
        System.out.println(kafkaProducerConfig);
    }
}
