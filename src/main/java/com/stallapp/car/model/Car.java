package com.stallapp.car.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.stallapp.mongodb.framework.document.BaseDocument;

@Document(collection = "#{carIndexConfig.collectionName()}")
public class Car extends BaseDocument<String> {

	private String brand;
	private String model;

	public Car(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public static class Builder {
		private String brand;
		private String model;
		
		public Builder withBrand(String brand) {
			this.brand = brand;
			return this;
		}
		
		public Builder withModel(String model) {
			this.model = model;
			return this;
		}
		
		public Car build() {
			return new Car(this.brand, this.model);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Id:- " + getId() + ", Brand:- " + getBrand() + ", Model:- " + getModel());
		return str.toString();
	}

}