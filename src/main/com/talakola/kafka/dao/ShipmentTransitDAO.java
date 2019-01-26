package com.talakola.kafka.dao;

import com.talakola.kafka.dao.mapper.*;
import com.talakola.kafka.model.ShipmentTransitModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShipmentTransitDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ShipmentTransitModel> getAllTransits() {
        String sql = "select * from shipment_transit_table";

        List<ShipmentTransitModel> allTransits = jdbcTemplate.query(sql, new ShipmentTransitMapper());
        return allTransits;
    }

}
