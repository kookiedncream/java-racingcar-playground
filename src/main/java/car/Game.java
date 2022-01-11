package car;

import java.util.List;

public class Game {
	public static final String NEW_LINE = "\n";
	public static final String DISTANCE = "-";
	private final List<Car> members;

	public Game(List<Car> members) {
		this.members = members;
	}

	public void proceed(int number) {
		for (int i = 0; i < number; i++) {
			proceedGame();
		}
	}

	private void proceedGame() {
		Car temp;
		for (int j = 0; j < members.size(); j++) {
			temp = members.get(j);
			move(temp);
			System.out.println(printAllMembers());
		}
	}

	private StringBuilder printAllMembers() {
		StringBuilder simul = new StringBuilder();
		makeString(simul);
		return simul;
	}

	private void makeString(StringBuilder simul) {
		simul.append("실행 결과")
				.append(NEW_LINE);
		Car member;
		for (int i = 0; i < members.size(); i++) {

			member = members.get(i);
			simul.append(member.getName())
					.append(" : ");

			int number = member.getDistance();
			for (int j = 0; j < number; j++) {
				simul.append(DISTANCE);
			}
			simul.append(NEW_LINE);
		}
		simul.append(NEW_LINE);
	}

	private void move(Car temp) {
		if (temp.isMovable(temp.makeRandomNumber())) {
			temp.move();
		}
	}
}
