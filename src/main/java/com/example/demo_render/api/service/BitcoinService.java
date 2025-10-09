package com.example.demo_render.api.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.Map;

@Service
public class BitcoinService {

    private final WebClient webClient;

    public BitcoinService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.coingecko.com/api/v3").build();
    }

    public double getBitcoinPriceInUsd() {
        Map response = this.webClient.get()
                .uri("/simple/price?ids=bitcoin&vs_currencies=usd")
                .retrieve()
                .bodyToMono(Map.class)
                .block();

        if (response != null && response.containsKey("bitcoin")) {
            Map<String, Object> bitcoinData = (Map<String, Object>) response.get("bitcoin");
            Object priceObj = bitcoinData.get("usd");

            if (priceObj instanceof Integer) {
                return ((Integer) priceObj).doubleValue();
            } else if (priceObj instanceof Double) {
                return (Double) priceObj;
            } else if (priceObj instanceof Number) {
                return ((Number) priceObj).doubleValue();
            }
        }

        return 0.0;
    }
}