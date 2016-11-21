package day22;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class testTurn {

    Turn turn;
    Player player;
    Player boss;
    Effect increaseHealthBy5;
    Effect doesNothingLastsOneTurn;
    Effect increaseArmorBy10;

    @Before
    public void setUp() throws Exception {
        increaseHealthBy5 = new Effect();
        increaseHealthBy5.setAffectOnHealth(5);
        increaseHealthBy5.setAffectOnArmor(3);
        increaseHealthBy5.setRemainingTurns(3);

        doesNothingLastsOneTurn = new Effect();
        doesNothingLastsOneTurn.setRemainingTurns(1);

        increaseArmorBy10 = new Effect();
        increaseArmorBy10.setAffectOnArmor(10);
        increaseArmorBy10.setRemainingTurns(3);


        Spell shield = new Spell();
        shield.setName("shield");
        shield.setManaCost(10);
        shield.setEffect(increaseArmorBy10);

        player = new Player(100, 100, 18, 0, Arrays.asList(shield));
        player.addEffect(increaseHealthBy5);
        player.addEffect(doesNothingLastsOneTurn);

        boss = new Player(100, 100, 5, 0, Arrays.asList(shield));


        turn = new Turn(1, player, boss);
    }

    @Test
    public void name() {
        assertTrue(player.getCurrentEffects().contains(doesNothingLastsOneTurn));

        turn.playTurn();

        assertTrue(player.getCurrentEffects().contains(increaseHealthBy5));
        assertTrue(player.getCurrentEffects().contains(increaseArmorBy10));
        assertFalse(player.getCurrentEffects().contains(doesNothingLastsOneTurn));
        assertEquals(player.getCurrentEffects().get(0).getRemainingTurns(), 2);
        assertEquals(player.getHealth(), 105);
        assertEquals(player.getArmor(), 31);

    }
}
