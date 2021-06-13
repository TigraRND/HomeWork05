package com.warcraft.game;

import com.warcraft.game.units.Berserk;
import com.warcraft.game.units.Knight;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

@SpringBootTest
class GameApplicationTests {

	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

	@Test
	@DisplayName("Тест берсерк с топором")
	void testBerserkWithAxe() {
		Berserk testBerserk = context.getBean("berserkWithAxe",Berserk.class);
		Knight testKnight = context.getBean("knightWithSword", Knight.class);

		testBerserk.attack(testKnight);

		assert (testKnight.getHealth() == 85.6);
	}

	@Test
	@DisplayName("Тест берсерк с мечом")
	void testBerserkWithSword() {
		Berserk testBerserk = context.getBean("berserkWithSword",Berserk.class);
		Knight testKnight = context.getBean("knightWithSword", Knight.class);

		testBerserk.attack(testKnight);

		assert (testKnight.getHealth() == 88.0);
	}

	@Test
	@DisplayName("Тест берсерк с луком")
	void testBerserkWithBow() {
		Berserk testBerserk = context.getBean("berserkWithBow",Berserk.class);
		Knight testKnight = context.getBean("knightWithSword", Knight.class);

		testBerserk.attack(testKnight);

		assert (testKnight.getHealth() == 89.2);
	}
}