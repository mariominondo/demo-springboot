package com.example.demo_render.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BitcoinPriceResponse {

    private Map<String, Double> bitcoin;

    public Map<String, Double> getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(Map<String, Double> bitcoin) {
        this.bitcoin = bitcoin;
    }
}