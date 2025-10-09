package com.example.demo_render.controller;

import com.example.demo_render.api.service.BitcoinService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final BitcoinService bitcoinService;

    public CalculatorController(BitcoinService bitcoinService) {
        this.bitcoinService = bitcoinService;
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam long satoshis, @RequestParam double prediction) {
        double currentPrice = bitcoinService.getBitcoinPriceInUsd();
        double futurePrice = currentPrice * (1 + prediction);
        double bitcoinAmount = satoshis / 100_100_00.0;
        double futureValue = bitcoinAmount * futurePrice;

        return String.format("Based on a price prediction of %.2f%%, your %d satoshis will be worth $%.2f", prediction * 100, satoshis, futureValue);
    }
}