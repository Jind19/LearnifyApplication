package com.example.learnifyMotivationService.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.example.learnifyMotivationService.model.Quote;

@Service
public class MotivationService {

    private final WebClient webClient;

    public MotivationService() {
        this.webClient = WebClient.create("https://api.quotable.io");
    }

    public Quote getRandomQuote() {
        return webClient.get()
                .uri("/random")
                .retrieve()
                .bodyToMono(Quote.class)
                .block();
    }
}

