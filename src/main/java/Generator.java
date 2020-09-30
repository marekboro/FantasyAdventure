import adventurers.Adventurer;
import adventurers.Knight;
import creatures.Monster;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Generator {

    Room room;
    Adventurer adventurer1;
    Adventurer adventurer2;
    Adventurer adventurer3;
    Adventurer adventurer4;
    Adventurer adventurer5;
    Adventurer adventurer6;

    Monster monster;

    private ArrayList<String> prefixes;
    private ArrayList<String> suffixes;

    public Generator() {
        this.prefixes = new ArrayList<String>();
        this.prefixes.add("Stone ");
        this.prefixes.add("Clay ");
        this.prefixes.add("Rock ");
        this.prefixes.add("Fire ");
        this.prefixes.add("Thorny ");

        this.suffixes = new ArrayList<String>();
        this.suffixes.add("Golem");
        this.suffixes.add("Beast");
        this.suffixes.add("Monster");




        this.room = room;
        this.adventurer1 = adventurer1;
        this.adventurer2 = adventurer2;
        this.adventurer3 = adventurer3;
        this.adventurer4 = adventurer4;
        this.adventurer5 = adventurer5;
        this.adventurer6 = adventurer6;
        this.monster = monster;
        this.prefixes = prefixes;
    }

    public Monster getRandomMonster(){
        Collections.shuffle(prefixes);
        Collections.shuffle(suffixes);
        String type = "" + prefixes.get(0) + suffixes.get(0);
        int hp = (int)((Math.random()*50)+1);
        int damage = (int)((Math.random()*5)+3);
        Monster monster = new Monster(type,hp,damage);
        return monster;
    }

   public int randomTreasure (){
        return (int)((Math.random()*50)+20);
   }

   public Room getRandomRoom(){
        room = new Room(getRandomMonster(),randomTreasure());
        return room;
   }





}
