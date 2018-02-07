package com.stallapp.car.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.stallapp.car.model.Car;
import com.stallapp.car.service.CarService;
import com.stallapp.car.spring.config.ApplicationConfig;

public class App {

	public static void main(String args[]) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		CarService carService = (CarService) context.getBean("carService");
		// Delete All cars
		carService.deleteAll();

		Car polo = new Car.Builder().withBrand("Volkswagen").withModel("Polo").build();
		carService.create(polo);

		Car jetta = new Car.Builder().withBrand("Volkswagen").withModel("Passat").build();
		carService.create(jetta);

		Car i20 = new Car.Builder().withBrand("Hyundai").withModel("i20").build();
		carService.create(i20);
		
		Car fordAspire = new Car.Builder().withBrand("Ford").withModel("Aspire").build();
		carService.create(fordAspire);
		
		Car fordMustang = new Car.Builder().withBrand("Ford").withModel("Mustang").build();
		carService.create(fordMustang);
		
		System.out.println("Find One:- " + carService.find(fordMustang));

/*		System.out.println("Find All!!");

		List<Car> cars = carService.findAll();
		for (Car car : cars) {
			System.out.println(car);
		}
		System.out.println();
		carService.delete(swift);

		System.out.println();
		i10.setModel("i10 Nxt");
		carService.update(i10);

		System.out.println("Find All After Update!!");

		cars = carService.findAll();
		for (Car car : cars) {
			System.out.println(car);
		}*/

		context.close();
	}

}
