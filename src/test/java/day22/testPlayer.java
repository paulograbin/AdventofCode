package day22;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class testPlayer {

    List<Spell> spells;

    @Before
    public void setUp() throws Exception {
        spells = new ArrayList<>();

        Spell magicMissile = new Spell();
        magicMissile.setName("1");
        magicMissile.setManaCost(53);
        spells.add(magicMissile);

        Spell drain = new Spell();
        drain.setName("2");
        drain.setManaCost(73);
        spells.add(drain);

        Spell mockSpell1 = new Spell();
        mockSpell1.setName("3");
        mockSpell1.setManaCost(89);
        spells.add(mockSpell1);

        Spell mockSpell11 = new Spell();
        mockSpell11.setName("4");
        mockSpell11.setManaCost(78);
        spells.add(mockSpell11);

        Spell mockSpell12 = new Spell();
        mockSpell12.setName("5");
        mockSpell12.setManaCost(900);
        spells.add(mockSpell12);
    }

    @Test
    public void name() {
        Player p = new Player(0, 53, 0, 0, spells);

        Spell casted = p.castSpell();

        assertEquals(casted, spells.get(0));
    }
}
