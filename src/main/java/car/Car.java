package car;

public class Car {
	private final String name;

	public Car(String name) {
		if (!isPossibleName(name)) {
			throw new IllegalArgumentException("이름을 5자 이하로 만들어 주세요.");
		}
		this.name = name;
	}

	private boolean isPossibleName(String name) {
		if (validateName(name.length())) {
			return true;
		}
		return false;
	}

	private boolean validateName(int length) {
		return length > 0 && length <= 5;
	}

	public String getName() {
		return this.name;
	}
}
