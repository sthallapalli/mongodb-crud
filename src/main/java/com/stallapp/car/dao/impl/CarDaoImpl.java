package com.stallapp.car.dao.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jpmorgan.car.model.QCar;
import com.querydsl.core.types.Predicate;
import com.stallapp.car.dao.CarDao;
import com.stallapp.car.model.Car;
import com.stallapp.mongodb.framework.respository.AbstractJMongoRespository;

@Repository
@Qualifier("carDao")
public class CarDaoImpl extends AbstractJMongoRespository<Car, String> implements CarDao {

	public CarDaoImpl() {
		super(Car.class);
	}

	@Override
	public void create(Car car) {
		super.insert(car);
	}

	@Override
	public void update(Car car) {
		//super.up
	}

	@Override
	public Car find(Car car) {
		QCar c = new QCar("car");
		Predicate p = c.brand.eq(car.getBrand()).and(c.model.eq(car.getModel()));
		return super.findOne(p);
	}

}
