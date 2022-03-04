package com.example.Spring.Depency.Injection.Examples.InjectorClasses;

import com.example.Spring.Depency.Injection.Examples.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PropertyInjector {
    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.greeting();
    }
}
