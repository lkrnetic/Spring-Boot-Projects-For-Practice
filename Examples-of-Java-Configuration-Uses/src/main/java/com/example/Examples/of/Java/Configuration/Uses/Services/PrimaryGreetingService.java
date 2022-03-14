package com.example.Examples.of.Java.Configuration.Uses.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class PrimaryGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Greeting from PrimaryGreetingService";
    }
}
