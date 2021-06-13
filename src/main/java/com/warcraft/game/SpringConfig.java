package com.warcraft.game;

import com.warcraft.game.units.*;
import com.warcraft.game.weapon.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.warcraft.game")
public class SpringConfig {

    @Bean
    public Unit berserkWithAxe(){
        return new Berserk(new Axe());
    }

    @Bean
    public Unit berserkWithSword(){
        return new Berserk(new Sword());
    }

    @Bean
    public Unit berserkWithBow(){
        return new Berserk(new Bow());
    }

    @Bean
    public Unit knightWithAxe(){
        return new Knight(new Axe());
    }

    @Bean
    public Unit knightWithSword(){
        return new Knight(new Sword());
    }

    @Bean
    public Unit knightWithBow(){
        return new Knight(new Bow());
    }
}