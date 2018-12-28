package com.meditab.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManagerformatter
{
	
	private final Carformatter _car;
	
	public CarManagerformatter(Carformatter car)
	{
		_car=car;
	}
    private List<Car> _carsDb = Arrays
        .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault"));

    public Car getFromDb(final String carId)
    {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

   
}
