package com.example.Examples.of.Java.Configuration.Uses.InjectorClasses;

import com.example.Examples.of.Java.Configuration.Uses.Services.GreetingService;
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
