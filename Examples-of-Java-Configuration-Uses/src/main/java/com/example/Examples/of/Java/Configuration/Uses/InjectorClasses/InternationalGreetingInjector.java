package com.example.Examples.of.Java.Configuration.Uses.InjectorClasses;

import com.example.Examples.of.Java.Configuration.Uses.Services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InternationalGreetingInjector {
    private final GreetingService greetingService;

    public InternationalGreetingInjector(@Qualifier("GreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.greeting();
    }
}
