package car;

import java.util.Random;

public class Car {
	private final String name;
	private int distance = 0;

	public Car(String name) {
		judgeName(name);
		this.name = name;
	}

	private void judgeName(String name) {
		if (!isPossibleName(name)) {
			throw new IllegalArgumentException("이름을 5자 이하로 만들어 주세요.");
		}
	}

	private boolean isPossibleName(String name) {
		return validateName(name.length());
	}

	private boolean validateName(int length) {
		return length > 0 && length <= 5;
	}

	public String getName() {
		return this.name;
	}

	public boolean isMovable(int number) {
		return number >= 4 && number <= 9;
	}

	public int makeRandomNumber() {
		Random random = new Random();
		return random.nextInt(10);
	}

	public int getDistance() {
		return this.distance;
	}

	public void move() {

		distance++;
	}

	/**
	 * 테스트용 함수
	 */
	public void setDistance(int number) {
		this.distance = number;
	}

	public void move(int number) {
		if (number < 4) {
			return;
		}
		distance++;
	}
}
