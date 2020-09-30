package toolsandweapons;

public class Consumable {
    String name;
    int value;

    public Consumable(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
