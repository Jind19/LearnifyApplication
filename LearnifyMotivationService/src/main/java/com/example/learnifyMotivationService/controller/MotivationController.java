package com.example.learnifyMotivationService.controller;


import com.example.learnifyMotivationService.model.Quote;
import com.example.learnifyMotivationService.service.MotivationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/motivation")
public class MotivationController {

    private final MotivationService motivationService;

    public MotivationController(MotivationService motivationService){
        this.motivationService = motivationService;
    }

    @GetMapping
    public Quote getMotivation(){
        return motivationService.getRandomQuote();
    }
}
