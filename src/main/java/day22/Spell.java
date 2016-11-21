package day22;


import lombok.Getter;
import lombok.Setter;

public class Spell {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private int manaCost;
    @Getter @Setter
    private int damage;
    @Getter @Setter
    private int health;
    @Getter @Setter
    private int armor;
    @Getter @Setter
    private Effect effect;

    @Override
    public String toString() {
        return "Spell{" +
                "name='" + name + '\'' +
                '}';
    }
}
