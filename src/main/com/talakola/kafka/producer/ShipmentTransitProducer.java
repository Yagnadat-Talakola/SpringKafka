package com.talakola.kafka.producer;

import com.google.gson.Gson;
import com.talakola.kafka.model.ShipmentTransitModel;
import com.talakola.kafka.service.ShipmentTransitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ShipmentTransitProducer {

    private static final Logger logger = LoggerFactory.getLogger(ShipmentTransitProducer.class);

    @Autowired
    ShipmentTransitService shipmentTransitService;

    @Autowired
    KafkaMessageSender kafkaMessageSender;

    public void produce() {
        Gson gson = new Gson();
        List<ShipmentTransitModel> transitList = shipmentTransitService.getAllTransits();
//        System.out.println("beginning to send");
        logger.info("beginning to send");
        transitList.stream().forEach(transit -> {
            String json = gson.toJson(transit);
            kafkaMessageSender.send(json);
        });
        logger.info("Sent successfully");
//        System.out.println("sent successfully");
    }
}
