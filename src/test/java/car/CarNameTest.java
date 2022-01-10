package car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarNameTest {

	@Test
	void isItFiveWords() {
		assertThatThrownBy(() -> new Car("abcdef"))
				.isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(() -> new Car(""))
				.isInstanceOf(IllegalArgumentException.class);

		Car car = new Car("clong");
		int length = car.getName()
				.length();
		assertThat(length).isEqualTo(5);
	}
}
