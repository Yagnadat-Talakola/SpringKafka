package com.talakola.kafka.config;

public class KafkaConsumerConfig {

    String consumerBootstrapServers;
    String topic;
    String groupId;
    String maxPollRecords;
    String autoOffsetReset;
    String keyDeserializer;
    String valueDeserializer;

    public KafkaConsumerConfig() {
    }

    public String getConsumerBootstrapServers() {
        return consumerBootstrapServers;
    }

    public String getTopic() {
        return topic;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getMaxPollRecords() {
        return maxPollRecords;
    }

    public String getAutoOffsetReset() {
        return autoOffsetReset;
    }

    public String getKeyDeserializer() {
        return keyDeserializer;
    }

    public String getValueDeserializer() {
        return valueDeserializer;
    }

    public void setConsumerBootstrapServers(String consumerBootstrapServers) {
        this.consumerBootstrapServers = consumerBootstrapServers;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setMaxPollRecords(String maxPollRecords) {
        this.maxPollRecords = maxPollRecords;
    }

    public void setAutoOffsetReset(String autoOffsetReset) {
        this.autoOffsetReset = autoOffsetReset;
    }

    public void setKeyDeserializer(String keyDeserializer) {
        this.keyDeserializer = keyDeserializer;
    }

    public void setValueDeserializer(String valueDeserializer) {
        this.valueDeserializer = valueDeserializer;
    }

    @Override
    public String toString() {
        return "KafkaConsumerConfig{" +
                "consumerBootstrapServers='" + consumerBootstrapServers + '\'' +
                ", topic='" + topic + '\'' +
                ", groupId='" + groupId + '\'' +
                ", maxPollRecords='" + maxPollRecords + '\'' +
                ", autoOffsetReset='" + autoOffsetReset + '\'' +
                ", keyDeserializer='" + keyDeserializer + '\'' +
                ", valueDeserializer='" + valueDeserializer + '\'' +
                '}';
    }
}
