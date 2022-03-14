package com.example.Examples.of.Java.Configuration.Uses.Services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        return "Greeting";
    }
}
