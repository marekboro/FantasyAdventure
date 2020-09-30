package creatures;

import adventurers.Adventurer;
import behaviours.ITakeDamage;

public class Monster extends Creature {

    private int currentDamage;
    public Monster(String type, int hp, int baseDamage) {
        super(type, hp, baseDamage);
        this.currentDamage = 0;
    }

    public void randomiseDamage(){
        int modifier = ((int)Math.random()*3) + 1;
        currentDamage = baseDamage+ modifier;
    }

    public void attack(Adventurer adventurer){
        randomiseDamage();
        adventurer.takeDmg(currentDamage);
    }

    public int getCurrentDamage() {
        return currentDamage;
    }
}
