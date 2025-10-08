package com.example.demo_render.api.service;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class BitcoinService {

    private final WebClient webClient;

    public BitcoinService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.coingecko.com/api/v3").build();
    }
}