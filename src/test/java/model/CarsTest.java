package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarsTest {

	@Test
	void carsTest() {
		Cars members = new Cars("pobi, crong, honux");
		int size = members.size();
		Assertions.assertThat(size).isEqualTo(3);
	}
}
