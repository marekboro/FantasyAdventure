import adventurers.Dwarf;
import org.junit.Before;
import org.junit.Test;
import toolsandweapons.Weapon;

import static org.junit.Assert.assertEquals;


public class DwarfTest {

    Dwarf dwarf;
    Weapon sword;

    @Before
    public void before(){
        dwarf = new Dwarf(30,"Steve");
        sword = new Weapon("Sword", 8);
    }
    
    @Test
    public void hasName(){
    assertEquals("Steve",dwarf.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(30,dwarf.getHp());
    }

    @Test
    public void canTakeDamage(){
        dwarf.takeDmg(10);
        assertEquals(20,dwarf.getHp());
    }
    @Test
    public void canHeal(){
        dwarf.takeDmg(10);
        assertEquals(20,dwarf.getHp());
        dwarf.heal(10);
        assertEquals(30,dwarf.getHp());
    }

    @Test
    public void hasAxe(){
        assertEquals("Axe",dwarf.getWeapon().getName());
        assertEquals(10,dwarf.getWeapon().getBaseDamage());

    }

    @Test
    public void canChangeWeapon() {
        assertEquals("Axe",dwarf.getWeapon().getName());
        assertEquals(10,dwarf.getWeapon().getBaseDamage());
        dwarf.changeWeapon(sword);
        assertEquals("Sword",dwarf.getWeapon().getName());
        assertEquals(8,dwarf.getWeapon().getBaseDamage());
    }
            





}
