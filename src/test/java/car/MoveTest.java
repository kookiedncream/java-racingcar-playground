package car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MoveTest {

	private static Car pobi;

	@BeforeEach
	void init() {
		pobi = new Car("pobi");
		pobi.setDistance(3); //테스트용 거리 입력
	}

	@ParameterizedTest
	@CsvSource({"4,true", "9,true", "0,false", "3,false"})
	void moveValidateTest(int number, boolean bool) {
		boolean movable = pobi.isMovable(number);
		assertThat(movable).isEqualTo(bool);
	}

	@ParameterizedTest
	@CsvSource({"4,4", "9,4", "0,3","3,3"})
	void moveTest(int number, int distance) {
//		int number = pobi.makeRandomNumber();
		pobi.move(number);
		assertThat(pobi.getDistance()).isEqualTo(distance);
	}
}
