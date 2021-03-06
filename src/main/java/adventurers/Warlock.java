package adventurers;

import behaviours.ICast;
import behaviours.ITakeDamage;
import creatures.MythicalBest;
import toolsandweapons.Spell;

import java.util.ArrayList;

public class Warlock extends Adventurer implements ICast {

    private MythicalBest best;
    private ArrayList<Spell> spellBook;
    private Spell selectedSpell;

    public Warlock(int hp, String name) {
        super(hp, name);
        best = null;
        spellBook = new ArrayList<Spell>();
        selectedSpell = null;
    }

    public void selectSpell(int index){
        this.selectedSpell = spellBook.get(index);
    }

    public void castSpell( ITakeDamage target){
        target.takeDmg(selectedSpell.getBaseDamage());
    };

    public void changeBest(MythicalBest best){
        this.best = best;
    }

    public void addSpellToBook(Spell spell){
        spellBook.add(spell);
    }

//    public void summonPet(MythicalBest best){
//        this.best = best;
//    }

}
