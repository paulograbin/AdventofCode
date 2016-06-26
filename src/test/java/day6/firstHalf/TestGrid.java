package day6.firstHalf;

import junit.framework.TestCase;

/**
 * Created by paulograbin on 27/04/16.
 */
public class TestGrid extends TestCase {

    Grid grid;
    int gridSize = 1000;

    @Override
    protected void setUp() throws Exception {
        grid = new Grid(gridSize);
    }

    public void testAacceptanceTestOne() {
        Operation op = new TurnOnOperation();

        grid.executeOperation(op, 0, 999, 0, 999);
        assertEquals(gridSize * gridSize, grid.getLightsOnCount());
    }

    public void testAcceptanceTestTwo() {
        Operation op = new TurnOnOperation();

        grid.executeOperation(op, 0, 999, 000, 000);
        assertEquals(gridSize, grid.getLightsOnCount());
    }





    public void testTurnOnOperation() {
        Operation op = new TurnOnOperation();

        grid.executeOperation(op, 0, 999, 0, 0);
        assertEquals(1000, grid.getLightsOnCount());
    }

    public void testGridSize() {
        assertEquals(grid.getSize(), gridSize * gridSize);
    }

}
