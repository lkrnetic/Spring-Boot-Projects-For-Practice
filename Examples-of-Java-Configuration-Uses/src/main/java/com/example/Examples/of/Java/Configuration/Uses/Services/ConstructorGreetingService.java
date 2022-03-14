package com.example.Examples.of.Java.Configuration.Uses.Services;

import org.springframework.stereotype.Service;


public class ConstructorGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Greeting from ConstructorGreetingService";
    }
}
