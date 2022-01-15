package model;

import java.util.ArrayList;
import java.util.List;

public class Members {

	private static List<Car> members;


	public Members() {
		members = new ArrayList<>();
	}

	public void add(Car member) {
		members.add(member);
	}

	public int size() {
		return members.size();
	}

	public void move(int randomNo, int position) {
		if (randomNo >= 4) {
			members.get(position).move(randomNo);
		}
	}

	public String getWinnersName() {
		String winners = "";

		int max = Integer.MIN_VALUE;

		for (Car c : members) {
			max = Math.max(c.position(), max);
		}

		winners = getWinners(winners, max);

		return winners;
	}

	private String getWinners(String winners, int max) {

		for (Car c : members) {
			if (c.position() == max) {
				winners += c.name() + " ";
			}
		}
		return winners;
	}

	public String result(int memberNo) {
		return members.get(memberNo).result();
	}
}
