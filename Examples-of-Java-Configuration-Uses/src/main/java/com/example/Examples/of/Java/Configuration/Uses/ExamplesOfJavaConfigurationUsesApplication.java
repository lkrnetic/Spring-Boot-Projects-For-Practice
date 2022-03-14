package com.example.Examples.of.Java.Configuration.Uses;

import com.example.Examples.of.Java.Configuration.Uses.InjectorClasses.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExamplesOfJavaConfigurationUsesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ExamplesOfJavaConfigurationUsesApplication.class, args);

		ConstructorInjector constructorInjector = (ConstructorInjector) context.getBean("constructorInjector");
		String greetingConstructorInjector = constructorInjector.greetingService.greeting();

		System.out.println("*************");
		System.out.println(greetingConstructorInjector);
		System.out.println("*************");

		PropertyInjector propertyInjector = (PropertyInjector) context.getBean("propertyInjector");
		String greetingPropertyInjector = propertyInjector.getGreeting();

		System.out.println("*************");
		System.out.println(greetingPropertyInjector);
		System.out.println("*************");

		SetterInjector setterInjector = (SetterInjector) context.getBean("setterInjector");
		String greetingSetterInjector = setterInjector.getGreeting();

		System.out.println("*************");
		System.out.println(greetingSetterInjector);
		System.out.println("*************");

		InternationalGreetingInjector internationalGreetingInjector = (InternationalGreetingInjector) context.getBean("internationalGreetingInjector");
		String greetingInternationalGreetingInjector = internationalGreetingInjector.getGreeting();

		System.out.println("*************");
		System.out.println(greetingInternationalGreetingInjector);
		System.out.println("*************");

		CarInjector carInjector = context.getBean("carInjector", CarInjector.class);
		System.out.println("--- The Best Car is ---");
		System.out.println(carInjector.whichCarIsBest());
	}

}
