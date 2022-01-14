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
}
