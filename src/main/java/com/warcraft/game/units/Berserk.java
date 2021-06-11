package com.warcraft.game.units;

import com.warcraft.game.weapon.Axe;

public class Berserk extends Unit{
    private double unitStrength = 1.2;
    private Axe weapon = new Axe();

    public void attack(Unit unit){
        unit.getDamage(weapon.use() * unitStrength);
    }
}
