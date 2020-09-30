package adventurers;

import behaviours.IAttack;
import behaviours.ITakeDamage;
import toolsandweapons.Weapon;

import java.util.ArrayList;

public class Dwarf extends Adventurer implements ITakeDamage, IAttack {
    private Weapon weapon;

    public Dwarf(int hp, String name) {
        super(hp, name);
        this.weapon = new Weapon("Axe",10);
    }

    public void takeDmg(int amount){
        int mitigated = 0;
//        mitigated = tryBlock();               // WILL reduce dmg by 4 at random.
        setHp(getHp()-(amount-mitigated));
    }
    public void attack1(ITakeDamage target){

    }
    public void attack2(ITakeDamage target ){

    }
    public void attack3(ITakeDamage target){

    }
    public int tryBlock(){
        int mitigated = 0;
        int random = (int)(Math.random()*10) +1;
        if (random > 5){
            mitigated = 4;
        }
        return mitigated;


    }
    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;

    }

    public Weapon getWeapon() {
        return weapon;
    }


}
