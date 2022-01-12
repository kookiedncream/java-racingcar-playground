package model;

public class Name {
	private String name;

	public Name(String name) {
		if (name.isEmpty()) {
			throw new IllegalStateException("이름을 입력해야 합니다");
		}

		if (isFiveDigit(name)) {
			throw new IllegalArgumentException("이름은 5글자 이하여야 합니다.");
		}

		this.name = name;
	}

	private boolean isFiveDigit(String name) {
		return name.length() > 5;
	}

	public String name() {
		return this.name;
	}

}
