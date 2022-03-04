package com.example.Spring.Depency.Injection.Examples.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("ES")
@Service("GreetingService")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Greeting from SpanishGreetingService";
    }
}