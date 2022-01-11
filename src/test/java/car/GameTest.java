package car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

	List<Car> members;
	Game game;

	@BeforeEach
	void init() {
		members = new ArrayList<>();
		Car pobi = new Car("pobi");
		Car clong = new Car("clong");

		members.add(pobi);
		members.add(clong);

		game = new Game(members);
	}

	@Test
	void proceedTest() {
		game.proceed(1);
		int distance = members.get(0).getDistance();
		assertThat(distance).isEqualTo(1);
	}

	@Test
	void gameEndTest() {
		List<String> gameEnd = game.isGameEnd();
	}
}
