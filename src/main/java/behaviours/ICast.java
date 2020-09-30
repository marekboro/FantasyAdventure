package behaviours;

import toolsandweapons.Spell;

public interface ICast {
    void castSpell(Spell spell, ITakeDamage target);
}
