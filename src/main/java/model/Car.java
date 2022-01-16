package model;

public class Car {
	private final Name id;
	private Position position;

	public Car(String name) {
		this.id = new Name(name);
		this.position = new Position();
	}

	public Car(String name, int position) {
		this.id = new Name(name);
		this.position = new Position(position);
	}

	public String name() {
		return id.name();
	}

	public int position() {
		return position.getPosition();
	}

	public void move(int randomNo) {
		this.position = position.move(randomNo);
	}

	public String result() {
		String result = "";

		for (int i = 0; i < position.getPosition(); i++) {
			result += "-";
		}

		return id.name() + " : " + result;
	}
}
