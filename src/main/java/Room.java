import adventurers.Adventurer;
import creatures.Monster;

import java.security.Principal;
import java.util.ArrayList;

public class Room {

    private ArrayList<Adventurer> adventurers;
    private Monster monster;
    int treasure;

    public Room(Monster monster, int treasure) {
        this.adventurers = new ArrayList<Adventurer>();
        this.monster = monster;
        this.treasure = treasure;
    }

    public ArrayList<Adventurer> getAdventurers() {
        return adventurers;
    }

    public void setAdventurers(ArrayList<Adventurer> adventurers) {
        this.adventurers = adventurers;
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
