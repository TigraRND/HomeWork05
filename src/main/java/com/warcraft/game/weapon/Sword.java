package com.warcraft.game.weapon;

public class Sword implements Weapon{
    private double damage = 10.0;

    public double use(){
        return damage;
    }
}