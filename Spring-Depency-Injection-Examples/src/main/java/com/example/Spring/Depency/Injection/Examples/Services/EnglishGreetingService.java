package com.example.Spring.Depency.Injection.Examples.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"EN", "default"})
@Service("GreetingService")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Greeting from EnglishGreetingService";
    }
}
