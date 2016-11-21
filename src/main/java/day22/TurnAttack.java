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

    public int getDamage() {
        return damage;
    }

    public Spell getSpell() {
        return spell;
    }
}
