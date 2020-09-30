package adventurers;

import behaviours.ITakeDamage;

public abstract class Adventurer implements ITakeDamage {
    private int hp;
    private String name;

    public Adventurer(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public void heal(int amount) {
        this.hp += amount;
    }

    public void takeDmg(int amount) {
        this.hp -= amount;
    }
    public boolean isAlive(){
        return this.hp >0;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
