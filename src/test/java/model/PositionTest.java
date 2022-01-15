package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {

	private static Car pobi;

	@BeforeEach
	void init() {
		pobi = new Car("pobi", 2);
	}

	@Test
	void move() {
		pobi.move(4);
		assertThat(pobi.position()).isEqualTo(3);
	}

	@Test
	void winnerTest() {
		Cars members = new Cars("pobi, crong, honux"){
			@Override
			protected int getRandomNo() {
				return 4;
			}
		};

		members.move();
		assertThat(members.winner()).isEqualTo("pobi crong honux ");
	}
}
