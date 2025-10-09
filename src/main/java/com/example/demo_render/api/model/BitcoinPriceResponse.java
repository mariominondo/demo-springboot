package com.example.demo_render.api.model;

import com.example.demo_render.api.model.BitcoinPrice;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BitcoinPriceResponse {

    private Map<String, BitcoinPrice> bitcoin;

    public Map<String, BitcoinPrice> getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(Map<String, BitcoinPrice> bitcoin) {
        this.bitcoin = bitcoin;
    }
}