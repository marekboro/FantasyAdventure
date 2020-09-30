package adventurers;

import behaviours.ICast;
import behaviours.ITakeDamage;
import creatures.MythicalBest;
import toolsandweapons.Spell;

import java.util.ArrayList;

public class Wizard extends Adventurer implements ICast {

    private MythicalBest best;
    private ArrayList<Spell> spellBook;
    private Spell selectedSpell;

    public Wizard(int hp, String name) {
        super(hp, name);
        best = null;
        spellBook = new ArrayList<Spell>();
        selectedSpell = null;
    }
    public void selectSpell(int index){
        this.selectedSpell = spellBook.get(index);
    }

    public void castSpell(Spell spell, ITakeDamage target){
        target.takeDmg(spell.getBaseDamage());
    };

    public void changeBest(MythicalBest best){
        this.best = best;
    }

    public void addSpellToBook(Spell spell){
        spellBook.add(spell);
    }

}
