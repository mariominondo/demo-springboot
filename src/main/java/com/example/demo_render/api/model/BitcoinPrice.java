package com.example.demo_render.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BitcoinPrice {

    @JsonProperty("usd")
    private double usd;

    // Getters and Setters
    public double getUsdPrice() {
        return usd;
    }

    public void setUsdPrice(double usdPrice) {
        this.usd = usdPrice;
    }
}