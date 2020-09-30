package adventurers;

import behaviours.IAttack;
import behaviours.ITakeDamage;
import toolsandweapons.Weapon;

public class Barbarian extends Adventurer implements IAttack{
    private Weapon weapon;

    public Barbarian(int hp, String name) {
        super(hp, name);
        this.weapon = new Weapon("Polearm",15);
    }

    public void takeDmg(int amount){
        setHp(getHp()-(amount));
    }
    public void attack(ITakeDamage target){

    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;

    }

    public Weapon getWeapon() {
        return weapon;
    }
}
