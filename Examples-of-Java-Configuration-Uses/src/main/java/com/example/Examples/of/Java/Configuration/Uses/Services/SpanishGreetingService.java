package com.example.Examples.of.Java.Configuration.Uses.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class SpanishGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Greeting from SpanishGreetingService";
    }
}