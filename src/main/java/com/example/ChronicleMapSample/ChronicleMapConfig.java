package com.example.ChronicleMapSample;

import net.openhft.chronicle.map.ChronicleMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChronicleMapConfig {

    @Bean
    public ChronicleMap<Long, String> createChronicleMap() {
        return ChronicleMap
                .of(Long.class, String.class)
                .name("example-map")
                .entries(1000)
                .averageValueSize(100)
                .create();
    }
}