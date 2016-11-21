package day22;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Player {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private int health;
    @Getter @Setter
    private int mana;
    @Getter @Setter
    private int armor;
    @Getter @Setter
    private int damage;
    @Getter @Setter
    private List<Spell> spells;

    @Getter @Setter
    private List<Effect> currentEffects;


    public Player() {
        this.spells = new ArrayList<>();
        this.currentEffects = new ArrayList<>();
    }

    public Player(int health, int mana, int armor, int damage, List<Spell> spells) {
        this.health = health;
        this.mana = mana;
        this.armor = armor;
        this.damage = damage;
        this.spells = spells;

        currentEffects = new ArrayList<>();
    }

    public void addEffect(Effect effect) {
        if (!currentEffects.contains(effect)) {
            currentEffects.add(effect);
        }
    }

    public void removeEffect(Effect effect) {
        if (currentEffects.contains(effect))
            currentEffects.remove(effect);
        else
            throw new RuntimeException("Should't pass here");
    }

    public TurnAttack playTurn() {
        if(damage == 0) {
            return new TurnAttack(0, castSpell());
        }

        return new TurnAttack(damage, null);
    }

    public Spell castSpell() {
        if(!hasEnoughMana()) {
            health = 0;
            return null;
        }

        Spell selectedOne = chooseSpell();
        while(!hasEnoughManaForSelectedSpell(selectedOne)) {
//            System.out.println(selectedOne + " re-selected!");
            selectedOne = chooseSpell();

        }

        System.out.println("Player casts " + selectedOne.getName());
        mana = mana - selectedOne.getManaCost();

        return selectedOne;
    }

    private boolean hasEnoughManaForSelectedSpell(Spell selectedOne) {
        return mana >= selectedOne.getManaCost();
    }

    private boolean hasEnoughMana() {
        return mana >= 53;
    }

    private Spell chooseSpell() {
        Random r = new Random();
        return spells.get(r.nextInt(spells.size()));
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
