package day22;


import java.util.ArrayList;
import java.util.List;

public class Game {

    Player player;
    Player boss;


    private List<Spell> getSpells() {
        ArrayList<Spell> spells = new ArrayList<>();

        Spell magicMissile = new Spell();
        magicMissile.setManaCost(53);
        magicMissile.setDamage(4);
        spells.add(magicMissile);

        Spell drain = new Spell();
        drain.setManaCost(73);
        drain.setDamage(2);
        drain.setHeal(2);
        spells.add(drain);


        Effect increaseArmorBy7 = new Effect();
        increaseArmorBy7.setArmor(7);

        Spell shield = new Spell();
        shield.setManaCost(113);
        shield.setEffectDuration(6);
        shield.setEffect(increaseArmorBy7);
        spells.add(shield);

        Effect dealDamage = new Effect();
        dealDamage.setHealth(-3);

        Spell poison = new Spell();
        poison.setManaCost(173);
        poison.setEffectDuration(6);
        poison.setEffect(dealDamage);
        spells.add(poison);


        Effect increaseMana = new Effect();
        increaseMana.setMana(101);

        Spell recharge = new Spell();
        recharge.setManaCost(229);
        recharge.setEffectDuration(5);
        recharge.setEffect(increaseMana);
        spells.add(recharge);

        return spells;
    }

    public Game() {
        player = new Player();
        player.setHealth(50);
        player.setMana(500);
        player.setSpells(getSpells());

        boss = new Player();
        boss.setHealth(71);
        boss.setDamage(10);
        boss.setSpells(getSpells());
    }

    public static void main(String... args) {
    }

}
