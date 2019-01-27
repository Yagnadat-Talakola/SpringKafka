package com.talakola.kafka.config;

import com.codahale.metrics.MetricFilter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.SharedMetricRegistries;
import com.codahale.metrics.graphite.Graphite;
import com.codahale.metrics.graphite.GraphiteReporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;

@Configuration
public class MetricsConfig {

    public static final MetricRegistry metricRegistry = SharedMetricRegistries.getOrCreate("test");


    @PostConstruct
    public void init() {
        final Graphite graphite = new Graphite(new InetSocketAddress("localhost", 2003));
        final GraphiteReporter reporter = GraphiteReporter.forRegistry(metricRegistry)
                .prefixedWith("com.kafka.shipment")
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.MILLISECONDS)
                .filter(MetricFilter.ALL)
                .build(graphite);
        reporter.start(1, TimeUnit.SECONDS);
    }

    @Bean
    public MetricRegistry metricRegistry() {
        return metricRegistry;
    }


}
