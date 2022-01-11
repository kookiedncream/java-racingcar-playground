package car;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

	@Test
	void proceedTest() {
		List<Car> members = new ArrayList<>();
		Car pobi = new Car("pobi");
		Car clong = new Car("clong");

		members.add(pobi);
		members.add(clong);

		Game game = new Game(members);

		game.proceed(1);
		int distance = pobi.getDistance();
		assertThat(distance).isEqualTo(1);
	}
}
