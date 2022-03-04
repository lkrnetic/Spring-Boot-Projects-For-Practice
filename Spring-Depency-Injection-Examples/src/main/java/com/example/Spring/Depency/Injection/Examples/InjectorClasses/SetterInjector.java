package com.example.Spring.Depency.Injection.Examples.InjectorClasses;

import com.example.Spring.Depency.Injection.Examples.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterInjector {
    @Qualifier("setterGreetingService")
    @Autowired
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.greeting();
    }
}
