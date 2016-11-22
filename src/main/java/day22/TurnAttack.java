package day22;

import lombok.Getter;


public class TurnAttack {

    @Getter
    private int damage;
    @Getter
    private Spell spell;

    public TurnAttack(int damage, Spell spell) {
        this.damage = damage;
        this.spell = spell;
    }

    @Override
    public String toString() {
        return "TurnAttack{" +
                "damage=" + damage +
                ", spell=" + spell +
                '}';
    }
}
