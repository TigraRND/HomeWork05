package com.warcraft.game;

import com.warcraft.game.units.Berserk;
import com.warcraft.game.units.Knight;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);

		Knight knight = new Knight();
		Berserk berserk = new Berserk();

		berserk.attack(knight);
		System.out.println(knight.getHealth());

		knight.healing(50.0);
		System.out.println(knight.getHealth());
	}

}
