package com.example.Spring.Depency.Injection.Examples.InjectorClasses;

import com.example.Spring.Depency.Injection.Examples.Services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjector {
    public GreetingService greetingService;

    public ConstructorInjector(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.greeting();
    }
}
