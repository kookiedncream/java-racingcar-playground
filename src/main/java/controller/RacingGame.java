package controller;

import model.Cars;
import view.GameView;

import java.util.Scanner;

public class RacingGame {
	public static void main(String[] args) {

		GameView view = new GameView();
		Scanner scanner = new Scanner(System.in);

		view.start();
		Cars members = new Cars(scanner.nextLine());

		view.init();
		int times = scanner.nextInt();

		for (int i = 0; i < times; i++) {
			members.move();
			System.out.println(members.result());
		}

		System.out.println(members.winner());
	}
}
