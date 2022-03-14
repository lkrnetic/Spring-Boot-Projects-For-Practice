package com.example.Examples.of.Java.Configuration.Uses.config;

import com.example.Examples.of.Java.Configuration.Uses.Services.*;
import com.example.Examples.of.Java.Configuration.Uses.repositories.PolishGreetingRepository;
import com.example.Examples.of.Java.Configuration.Uses.repositories.PolishGreetingRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    CarServiceFactory carServiceFactory () {
        return new CarServiceFactory();
    }

    @Profile({"mercedes", "default"})
    @Bean
    CarService mercedesCarService(CarServiceFactory carServiceFactory) {
        return carServiceFactory.getCarService("mercedes");
    }

    @Profile({"audi"})
    @Bean
    CarService audiCarService(CarServiceFactory carServiceFactory) {
        return carServiceFactory.getCarService("audi");
    }

    @Bean
    PolishGreetingRepository polishGreetingRepository() {
        return new PolishGreetingRepositoryImpl();
    }

    @Profile({"PL", "default"})
    @Bean("GreetingService")
    PolishGreetingService polishGreetingService(PolishGreetingRepository polishGreetingRepository) {
        return new PolishGreetingService(polishGreetingRepository);
    }


    @Profile({"ES"})
    @Bean("GreetingService")
    SpanishGreetingService spanishGreetingService() {
        return new SpanishGreetingService();
    }

    @Profile("EN")
    @Bean
    EnglishGreetingService GreetingService() {
        return new EnglishGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyGreetingService propertyGreetingService() {
        return new PropertyGreetingService();
    }
    @Bean
    SetterGreetingService setterGreetingService() {
        return new SetterGreetingService();
    }

}
