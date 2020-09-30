import adventurers.Adventurer;
import creatures.Monster;

import java.security.Principal;

public class Room {

    private Adventurer adventurer;
    private Monster monster;
    int treasure;

    public Room(Adventurer adventurer, Monster monster, int treasure) {
        this.adventurer = adventurer;
        this.monster = monster;
        this.treasure = treasure;
    }

    public Adventurer getAdventurer() {
        return adventurer;
    }

    public void setAdventurer(Adventurer adventurer) {
        this.adventurer = adventurer;
    }

    public Monster getMonster() {
        return monster;
    }


    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public int getTreasure() {
        return treasure;
    }

    public void setTreasure(int treasure) {
        this.treasure = treasure;
    }
}
