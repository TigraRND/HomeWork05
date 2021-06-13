package com.warcraft.game.units;

import com.warcraft.game.weapon.Axe;
import com.warcraft.game.weapon.Weapon;

public class Berserk extends Unit{
    private double unitStrength = 1.2;
    private Weapon weapon;

    public Berserk(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(Unit unit){
        unit.getDamage(weapon.use() * unitStrength);
    }
}