package com.example.demo_render.api.service;


import com.example.demo_render.api.model.BitcoinPrice;
import com.example.demo_render.api.model.BitcoinPriceResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class BitcoinService {

    private final WebClient webClient;

    public BitcoinService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.coingecko.com/api/v3").build();
    }

    public double getBitcoinPriceInUsd() {
        BitcoinPriceResponse response = this.webClient.get()
                .uri("/simple/price?ids=bitcoin&vs_currencies=usd")
                .retrieve()
                .bodyToMono(BitcoinPriceResponse.class)
                .block(); // block() to get synchronous response

        return response.getBitcoin().get("bitcoin").getUsdPrice();
    }
}