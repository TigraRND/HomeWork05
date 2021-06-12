package com.warcraft.game.units;

import com.warcraft.game.weapon.Sword;
import com.warcraft.game.weapon.Weapon;

public class Knight extends Unit{
    private double unitStrength = 1.0;
    private Weapon weapon;

    public Knight(Weapon weapon){
        this.weapon = weapon;
    }

    public double attack(){
        return weapon.use() * unitStrength;
    }
}
