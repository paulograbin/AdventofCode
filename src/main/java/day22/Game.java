package day22;


import java.util.ArrayList;
import java.util.List;

public class Game implements Runnable {

    private Player player;
    private Player boss;

    private Player winner;

    private ArrayList<Turn> turns;
    private int manaSum;


    public Game() {
        player = new Player();
        player.setName("Hero");
        player.setHealth(50);
        player.setMana(500);
        player.setSpells(getSpells());

        boss = new Player();
        boss.setName("Boss");
        boss.setHealth(71);
        boss.setDamage(10);
        boss.setSpells(getSpells());

        turns = new ArrayList<>();
    }


    public void play() {
        int counter = 0;

        while(playersAreAlive()) {
            if(counter % 2 == 0) {
                System.out.println("Player turn - " + counter);
                printTurnHeader();

                Turn currentTurn = new Turn(turns.size(), player, boss);

                currentTurn.playTurn();

                turns.add(currentTurn);
            }
            else {
                System.out.println("Boss turn - " + counter);
                printTurnHeader();

                Turn currentTurn = new Turn(turns.size(), boss, player);

                currentTurn.playTurn();

                turns.add(currentTurn);
            }

            System.out.println("");
            counter += 1;
        }

        if(hasPlayerWon()) {
            winner = player;
            System.out.println("Player has won!");
            calculateManaUsedByPlayer();
        } else if(boss.getHealth() > 0 && player.getHealth() <= 0) {
            winner = boss;
            System.out.println("Boss has won!");
        }

        System.out.println(counter + " played turns");

    }

    public void printTurnHeader() {
        System.out.println("Player has " + player.getHealth() + " hit points, " + player.getArmor() + " armor, " + player.getMana() + " mana");
        System.out.println("Boss has " + boss.getHealth() + " hit points");
    }

    public boolean hasPlayerWon() {
        return player.getHealth() > 0 && boss.getHealth() <= 0;
    }

    private void calculateManaUsedByPlayer() {
        turns.stream()
                .filter(t -> t.getPlayer() == player)
                .forEach(t -> manaSum = manaSum + t.getSpellUsedByPlayer().getManaCost());
    }

    private boolean playersAreAlive() {
        return player.getHealth() > 0 && boss.getHealth() > 0;
    }

    private List<Spell> getSpells() {
        ArrayList<Spell> spells = new ArrayList<>();

        Spell magicMissile = new Spell();
        magicMissile.setName("Magic missile");
        magicMissile.setManaCost(53);
        magicMissile.setDamage(4);
        spells.add(magicMissile);

        Spell drain = new Spell();
        drain.setName("Drain");
        drain.setManaCost(73);
        drain.setDamage(2);
        drain.setHealth(2);
        spells.add(drain);


        Effect increaseArmorBy7 = new Effect();
        increaseArmorBy7.setName("Increase armor by 7");
        increaseArmorBy7.setAffectOnArmor(7);
        increaseArmorBy7.setDuration(6);
        increaseArmorBy7.setSelfEffect(true);
        increaseArmorBy7.setOneTimer(true);

        Spell shield = new Spell();
        shield.setName("Shield");
        shield.setManaCost(113);
        shield.setEffect(increaseArmorBy7);
        spells.add(shield);


        Effect dealDamage = new Effect();
        dealDamage.setName("Deal damage");
        dealDamage.setAffectOnHealth(-3);
        dealDamage.setDuration(6);
        dealDamage.setSelfEffect(false);

        Spell poison = new Spell();
        poison.setName("Poison");
        poison.setManaCost(173);
        poison.setEffect(dealDamage);
        spells.add(poison);


        Effect increaseMana = new Effect();
        increaseMana.setName("Increase mana");
        increaseMana.setAffectOnMana(101);
        increaseMana.setDuration(5);
        increaseMana.setSelfEffect(true);

        Spell recharge = new Spell();
        recharge.setName("Recharge");
        recharge.setManaCost(229);
        recharge.setEffect(increaseMana);
        spells.add(recharge);

        return spells;
    }

    public int getManaSum() {
        return manaSum;
    }

    public static void main(String... args) {
        int matches = 1;
        int leastAmountOfMana = Integer.MAX_VALUE;

        for(int i = 0; i < matches; i++) {
            System.out.println("Match " + i);
            Game game = new Game();
            game.run();

            if(game.hasPlayerWon()) {
                if(game.getManaSum() < leastAmountOfMana)
                    leastAmountOfMana = game.getManaSum();
            }
        }

        System.out.println("Least mana user by player is: " + leastAmountOfMana);
    }

    @Override
    public void run() {
        play();
    }
}
