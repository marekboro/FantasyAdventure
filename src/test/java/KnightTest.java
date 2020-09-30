import adventurers.Dwarf;
import adventurers.Knight;
import org.junit.Before;
import org.junit.Test;
import toolsandweapons.Weapon;

import static org.junit.Assert.assertEquals;

public class KnightTest {

        Knight knight;


        @Before
        public void before(){
            knight = new Knight(30,"John");

        }

        @Test
        public void canPray(){
            knight.takeDmg(10);
            assertEquals(20,knight.getHp());
            knight.pray();
            assertEquals(24,knight.getHp());
            assertEquals(10,knight.getWeapon().getBaseDamage());
        }

}
