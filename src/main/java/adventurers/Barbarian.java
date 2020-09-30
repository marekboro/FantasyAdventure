package adventurers;

import behaviours.IAttack;
import behaviours.ITakeDamage;
import toolsandweapons.Weapon;

public class Barbarian extends Adventurer implements IAttack, ITakeDamage {
    private Weapon weapon;

    public Barbarian(int hp, String name) {
        super(hp, name);
        this.weapon = new Weapon("Polearm",15);
    }

    public void takeDmg(int amount){
        setHp(getHp()-(amount));
    }
    public void attack1(ITakeDamage target){

    }
    public void attack2(ITakeDamage target){

    }
    public void attack3(ITakeDamage target){

    }
    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;

    }

    public Weapon getWeapon() {
        return weapon;
    }
}
