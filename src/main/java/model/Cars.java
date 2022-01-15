package model;


import java.util.Random;

public class Cars {
	public static final String WHITE_SPACE = " ";
	public static final String NONE_SPACE = "";
	public static final String COMMA = ",";
	public static final int BOUND = 10;
	public static final String NEW_LINE = "\n";
	private Members members;

	public Cars(String words) {
		this.members = getMembers(words);
	}

	private Members getMembers(String words) {
		Members members = new Members();

		String[] split = words.replace(WHITE_SPACE, NONE_SPACE)
				.split(COMMA);

		for (String s : split) {
			members.add(new Car(s));
		}

		return members;
	}

	public int size() {
		return members.size();
	}

	public void move() {
		for (int i = 0; i < members.size(); i++) {
			members.move(getRandomNo(), i);
		}
	}

	protected int getRandomNo() {
		Random random = new Random();
		return random.nextInt(BOUND);
	}


	public String winner() {
		return members.getWinnersName();
	}

	protected Members getMembers() {
		return this.members;
	}

	public String result() {
		String temp = "";
		for (int i = 0; i < members.size(); i++) {
			temp += members.result(i);
			temp += NEW_LINE;
		}

		return temp;
	}
}
