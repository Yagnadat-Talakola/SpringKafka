package com.talakola.kafka.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:config.properties")
public class AppConfig {

    @Autowired
    Environment enivronment;

//    @Bean
//    @ConfigurationProperties(prefix = "kafka.producer.stock")
//    public KafkaProducerConfig getKafkaProducerConfig() {
//        return new KafkaProducerConfig();
//    }

    @Bean
    @ConfigurationProperties(prefix="spring.datasource.hikari")
    public HikariConfig getHikariConfig() {
        return new HikariConfig();
    }

    @Bean
    public HikariDataSource getDataSource() {
        return new HikariDataSource(getHikariConfig());
    }

}
