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
//        List<Spell> possibleSpells = getSpells().stream().filter(spell -> spell.getManaCost() <= mana).collect(Collectors.toList());
//
//        if(possibleSpells.size() == 0) {
//            health = 0;
//            return null;
//        }
//
//        Spell selectedOne = chooseSpell(possibleSpells);
//        while(playerAlreadyHaveThisEffect(selectedOne.getEffect())) {
//            selectedOne = chooseSpell(possibleSpells);
//        }
//
//        while(!hasEnoughManaForSelectedSpell(selectedOne)) {
////            System.out.println(selectedOne + " re-selected!");
//            selectedOne = chooseSpell(possibleSpells);
//        }

        Spell selectedOne = null;

        if(mana >= 229 && !currentEffects.contains(spells.get(4).getEffect())) {
            selectedOne = spells.get(4);
            mana = mana - selectedOne.getManaCost();
            System.out.println("Player casts " + selectedOne.getName());
            return selectedOne;
        }

        if(mana >= 113 && !currentEffects.contains(spells.get(2).getEffect())) {
            selectedOne = spells.get(2);
            mana = mana - selectedOne.getManaCost();
            System.out.println("Player casts " + selectedOne.getName());
            return selectedOne;
        }

        if(mana >= 173 && !currentEffects.contains(spells.get(3).getEffect())) {
            selectedOne = spells.get(3);

            Effect poisonEffect = spells.get(3).getEffect();
            poisonEffect.setAffectOnHealth(0);
            addEffect(poisonEffect);

            mana = mana - selectedOne.getManaCost();
            System.out.println("Player casts " + selectedOne.getName());
            return selectedOne;
        }

        if (mana >= 73) {
            int number = new Random().nextInt(1);

            if(number == 0)
                selectedOne = spells.get(0);
            if(number == 1)
                selectedOne = spells.get(1);

            mana = mana - selectedOne.getManaCost();
            System.out.println("Player casts " + selectedOne.getName());
            return selectedOne;
        }

        else if(mana >= 53) {
            selectedOne = spells.get(0);

            mana = mana - selectedOne.getManaCost();
            System.out.println("Player casts " + selectedOne.getName());
            return selectedOne;
        } else {
            health = 0;
            return null;
        }
//
//
//        System.out.println("Player casts " + selectedOne.getName());
//        mana = mana - selectedOne.getManaCost();
//
//        return selectedOne;
    }

    private boolean playerAlreadyHaveThisEffect(Effect effect) {
        if(effect != null) {
            return currentEffects.contains(effect);
        }

        return false;
    }

    private boolean hasEnoughManaForSelectedSpell(Spell selectedOne) {
        return mana >= selectedOne.getManaCost();
    }

    private boolean hasEnoughMana() {
        return mana >= 53;
    }

    private Spell chooseSpell(List<Spell> possibleSpells) {
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
