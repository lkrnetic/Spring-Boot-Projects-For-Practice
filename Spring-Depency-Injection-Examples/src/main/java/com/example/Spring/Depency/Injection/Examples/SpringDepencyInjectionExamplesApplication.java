package com.example.Spring.Depency.Injection.Examples;

import com.example.Spring.Depency.Injection.Examples.InjectorClasses.ConstructorInjector;
import com.example.Spring.Depency.Injection.Examples.InjectorClasses.InternationalGreetingInjector;
import com.example.Spring.Depency.Injection.Examples.InjectorClasses.PropertyInjector;
import com.example.Spring.Depency.Injection.Examples.InjectorClasses.SetterInjector;
import com.example.Spring.Depency.Injection.Examples.Services.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDepencyInjectionExamplesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDepencyInjectionExamplesApplication.class, args);

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


	}

}
