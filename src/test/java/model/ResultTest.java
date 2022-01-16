package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResultTest {

	@Test
	void resultTest() {
		Car car = new Car("pobi", 2);
		String result = car.result();
		assertThat(result).isEqualTo("pobi : --");
	}

	@Test
	void resultsTest() {
		Cars members = new Cars("pobi, crong, honux"){
			@Override
			protected int getRandomNo() {
				return 4;
			}
		};
		members.move();
		String result = members.result();
		assertThat(result).isEqualTo("pobi : -\n" +
				"crong : -\n" +
				"honux : -\n");

	}
}
