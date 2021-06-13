package com.warcraft.game.units;

public abstract class Unit {
    private double maxHealth = 100;
    private double health;
    private boolean isAlive;

    public Unit(){
        health = maxHealth;
        isAlive = true;
    }

    public void getDamage(double damage){
        health -= damage;
        if(health < 0){
            health = 0;
            isAlive = false;
        }
    }

    public void healing(double hp){
        if(isAlive){
            health += hp;
            if(health > maxHealth)
                health = maxHealth;
        }
    }

    public double getHealth(){
        return health;
    }
}