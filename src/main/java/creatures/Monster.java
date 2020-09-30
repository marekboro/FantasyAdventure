package creatures;

import adventurers.Adventurer;
import behaviours.ITakeDamage;

public class Monster extends Creature {


    public Monster(String type, int hp, int baseDamage) {
        super(type, hp, baseDamage);
    }

    public void attack(Adventurer adventurer){
        adventurer.takeDmg(baseDamage);
    }

}
