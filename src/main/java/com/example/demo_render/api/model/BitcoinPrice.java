package com.example.demo_render.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BitcoinPrice {

    @JsonProperty("usd")
    private double usdPrice;

    // Getters and Setters
    public double getUsdPrice() {
        return usdPrice;
    }

    public void setUsdPrice(double usdPrice) {
        this.usdPrice = usdPrice;
    }
}