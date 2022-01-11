package car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Car> members = new ArrayList<>();

		String[] split = scanner.nextLine().split(",");
		for (int i = 0; i < split.length; i++) {
			members.add(new Car(split[i]));
		}

		Game game = new Game(members);

		int times = scanner.nextInt();
		game.proceed(times);
		List<String> winnerList = game.isGameEnd();
		for (String s : winnerList) {
			System.out.print(s + " ");
		}
		System.out.println("가 우승입니다.");
	}
}
