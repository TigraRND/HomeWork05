package com.warcraft.game;

import com.warcraft.game.units.Berserk;
import com.warcraft.game.units.Knight;
import com.warcraft.game.weapon.Axe;
import com.warcraft.game.weapon.Bow;
import com.warcraft.game.weapon.Sword;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);

		Knight knight = new Knight(new Sword());
		Berserk berserk = new Berserk(new Axe());
		Berserk archer = new Berserk(new Bow());

		System.out.println("Берсерк атакует топором рыцаря");
		berserk.attack(knight);
		System.out.println("Здоровье рыцаря после атаки " + knight.getHealth());

		System.out.println("Рыцарь лечится");
		knight.healing(50.0);
		System.out.println("Здоровье рыцаря после лечения " + knight.getHealth());

		System.out.println("Берсерк лучник атакует берсеркра с топором");
		archer.attack(berserk);
		System.out.println("Здоровье берсеркра после атаки луком " + berserk.getHealth());
	}

}
