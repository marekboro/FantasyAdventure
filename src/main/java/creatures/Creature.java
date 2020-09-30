package creatures;

import behaviours.ITakeDamage;

public abstract class Creature implements ITakeDamage {
    String type;
    int hp;
    int baseDamage;

    public Creature(String type, int hp, int baseDamage) {
        this.type = type;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    public String getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void takeDmg(int amount){
        setHp(getHp()-amount);
    };

    public boolean isAlive(){
        return this.hp >0;
    }
}
