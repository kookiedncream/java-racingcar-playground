package car;

import java.util.ArrayList;
import java.util.List;

public class Game {
	public static final String NEW_LINE = "\n";
	public static final String DISTANCE = "-";
	private final List<Car> members;
	private StringBuilder simul = new StringBuilder();

	public Game(List<Car> members) {
		this.members = members;
	}

	public void proceed(int number) {
		simul.append("실행 결과")
				.append(NEW_LINE);
		for (int i = 0; i < number; i++) {
			proceedGame();
			simul.append(NEW_LINE);
		}
		System.out.println(simul);
	}

	private void proceedGame() {
		Car temp;

		for (int i = 0; i < members.size(); i++) {
			temp = members.get(i);
			move(temp);
			makeString(i);
		}
	}

	private void makeString(int i) {
		Car member;

		member = members.get(i);
		simul.append(member.getName())
				.append(" : ");

		inputDistance(member);
	}

	private void inputDistance(Car member) {
		int number = member.getDistance();
		for (int j = 0; j < number; j++) {
			simul.append(DISTANCE);
		}
		simul.append(NEW_LINE);
	}

	private void move(Car temp) {
		if (temp.isMovable(temp.makeRandomNumber())) {
			temp.move();
		}
	}

	public List<String> isGameEnd() {

		List<String> result = new ArrayList<>();

		sortList();

		return getResult(result);
	}

	private List<String> getResult(List<String> result) {

		result.add(members.get(0).getName());
		int max = members.get(0).getDistance();

		findMoreWinner(result);

		return result;
	}

	private void findMoreWinner(List<String> result) {
		int max = members.get(0).getDistance();

		for (int i = 1; i < members.size(); i++) {
			Car nextMember = members.get(i);
			if (max > nextMember.getDistance()) {
				break;
			}
			result.add(nextMember.getName());
		}
	}

	private void sortList() {
		members.sort((a, b) -> b.getDistance() - a.getDistance());
	}
}
