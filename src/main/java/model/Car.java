package model;

public class Car {
	private final Name id;

	public Car(String name) {
		this.id = new Name(name);
	}

	public String name() {
		return id.name();
	}

}
