package adventurers;

import behaviours.ICast;
import behaviours.ITakeDamage;
import creatures.MythicalBest;
import toolsandweapons.Consumable;
import toolsandweapons.Spell;

import java.util.ArrayList;

public class Cleric extends Adventurer {

//    private ArrayList<Consumable> consumables;
    private Consumable selectedConsumable;

    public Cleric(int hp, String name) {
        super(hp, name);
//        this.consumables = new ArrayList<Consumable>();
        this.selectedConsumable = null;
    }


    public void heal(Adventurer adventurer){
      adventurer.heal(selectedConsumable.getValue());
      this.selectedConsumable = null;
    };

    public void changeConsumable(Consumable consumable){
        this.selectedConsumable = consumable;
    }

//    public void addConsumableToBackpack(Consumable consumable){
//        consumables.add(consumable);
//    }






}
