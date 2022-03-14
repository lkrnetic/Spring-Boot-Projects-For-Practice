package com.example.Examples.of.Java.Configuration.Uses.Services;

import org.springframework.stereotype.Service;


public class CarServiceFactory {

    public CarService getCarService(String carType) {
        switch (carType) {
            case "mercedes":
                return new MercedesCarService();
            case "audi":
                return new AudiCarService();
            default:
                return new MercedesCarService();
        }
    }
}
