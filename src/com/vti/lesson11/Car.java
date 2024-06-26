package com.vti.lesson11;

public class Car {
	private String name;
	private String type;
	private Engine engine;

	public Car(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public class Engine {
		private String engineType;

		public Engine(String engineType) {
			this.engineType = engineType;
		}

		public String getEngineType() {
			return engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}

		public String toString() {
			return this.engineType;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}