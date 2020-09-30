import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratorTest {


    Generator generator;

    @Before
    public void before(){
        generator = new Generator();
    }

    @Test
    public void canGenerateMonster(){
        assertTrue(generator.getRandomMonster().getType().length()>0);

    }


}
