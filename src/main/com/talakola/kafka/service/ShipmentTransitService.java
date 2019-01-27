package com.talakola.kafka.service;

import com.talakola.kafka.dao.ShipmentTransitDAO;
import com.talakola.kafka.model.ShipmentTransitModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentTransitService {

    @Autowired
    ShipmentTransitDAO shipmentTransitDAO;

    public List<ShipmentTransitModel> getAllTransits() {
        return shipmentTransitDAO.getAllTransits();
    }
}
