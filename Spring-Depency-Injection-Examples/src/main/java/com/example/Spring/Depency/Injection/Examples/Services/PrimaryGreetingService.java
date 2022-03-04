package com.example.Spring.Depency.Injection.Examples.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Greeting from PrimaryGreetingService";
    }

}
