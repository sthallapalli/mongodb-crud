package com.stallapp.car.index.config;

import org.springframework.beans.factory.annotation.Value;

public class CarIndexConfigImpl implements CarIndexConfig {

	@Value("${stallapp.mongo.collectionName}")
	private String collectionName;

	public String collectionName() {
		return collectionName;
	}
}