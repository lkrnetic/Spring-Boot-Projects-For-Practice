package com.example.Examples.of.Java.Configuration.Uses.InjectorClasses;

import com.example.Examples.of.Java.Configuration.Uses.Services.CarService;
import org.springframework.stereotype.Component;

@Component
public class CarInjector {

    private final CarService carService;

    public CarInjector(CarService carService) {
        this.carService = carService;
    }

    public String whichCarIsBest() {
        return carService.getCarType();
    }
}
