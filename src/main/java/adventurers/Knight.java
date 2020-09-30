package adventurers;

import behaviours.IAttack;
import behaviours.ITakeDamage;
import toolsandweapons.Weapon;

public class Knight extends Adventurer implements IAttack{
    private Weapon weapon;

    public Knight(int hp, String name) {
        super(hp, name);
        this.weapon = new Weapon("Sword", 8);
    }
    public void takeDmg(int amount){
        int mitigated = 0;
//        mitigated = tryBlock();               // WILL reduce dmg by 4 at random.
        setHp(getHp()-(amount-mitigated));
    }
    public void attack(ITakeDamage target){
        target.takeDmg(weapon.getBaseDamage());
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

    public void pray(){
        this.weapon.setBaseDamage(weapon.getBaseDamage()+2);
        heal(4);
    }
}
