package com.example.Examples.of.Java.Configuration.Uses.repositories;

public class PolishGreetingRepositoryImpl implements PolishGreetingRepository {
    @Override
    public String greeting() {
        return "Pozdrowienie z polski";
    }
}
