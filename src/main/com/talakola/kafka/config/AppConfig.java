package com.talakola.kafka.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConfigurationProperties(prefix = "kafka.consumer.stock", ignoreUnknownFields = false)
    public KafkaConsumerConfig getKafkaConsumerConfig() {
        return new KafkaConsumerConfig();
//        System.out.println(config);
//        return config;
    }


}
