package com.example.Spring.Depency.Injection.Examples.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Greeting from ConstructorGreetingService";
    }
}
