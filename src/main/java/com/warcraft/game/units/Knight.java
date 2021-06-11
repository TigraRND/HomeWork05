package com.warcraft.game.units;

import com.warcraft.game.weapon.Sword;

public class Knight extends Unit{
    private double unitStrength = 1.0;
    private Sword weapon = new Sword();

    public double attack(){
        return weapon.use() * unitStrength;
    }
}
