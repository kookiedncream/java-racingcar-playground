package model;

public class Position {
	private final int position;

	public Position() {
		this.position = 0;
	}

	public Position(int position) {
		this.position = position;
	}

	public int getPosition() {
		return this.position;
	}

	public Position move(int randomNo) {
		if (randomNo >= 4) {
			return new Position(this.position + 1);
		}
		return new Position();
	}
}
