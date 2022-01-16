package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

	@Test
	void nameTest() {
		Car crong = new Car("crong");
		String name = crong.name();
		assertThat(name).isEqualTo("crong");
		assertThatThrownBy(() -> new Car("abcdef"))
				.isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(() -> new Car(""))
				.isInstanceOf(IllegalStateException.class);
	}
}
