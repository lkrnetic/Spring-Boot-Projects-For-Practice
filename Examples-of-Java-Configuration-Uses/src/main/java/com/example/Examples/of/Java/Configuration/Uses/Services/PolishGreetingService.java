package com.example.Examples.of.Java.Configuration.Uses.Services;

import com.example.Examples.of.Java.Configuration.Uses.repositories.PolishGreetingRepository;

public class PolishGreetingService implements GreetingService {
    private final PolishGreetingRepository polishGreetingRepository;

    public PolishGreetingService(PolishGreetingRepository polishGreetingRepository) {
        this.polishGreetingRepository = polishGreetingRepository;
    }

    @Override
    public String greeting() {
        return "Pozdrowienie z polski ";
    }
}

