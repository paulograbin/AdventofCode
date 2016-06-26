package day6.secondHalf;


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
        assertEquals(gridSize * gridSize, grid.getBrightnessSum());
    }

    public void testAcceptanceTestTwo() {
        Operation op = new TurnOnOperation();

        grid.executeOperation(op, 0, 999, 000, 000);
        assertEquals(gridSize, grid.getBrightnessSum());
    }

    public void testAcceptanceThree() {
        Operation op = new TurnOnOperation();

        grid.executeOperation(op, 0, 0, 0, 0);
        assertEquals(grid.getBrightnessSum(), 1);
    }

    public void testAcceptanceFour() {
        Operation op = new ToggleOperation();

        grid.executeOperation(op, 0, 0, 0, 999);
        assertEquals(grid.getBrightnessSum(), 2000);
    }

    public void testToggleAcceptance() {
        Operation op = new ToggleOperation();

        grid.executeOperation(op, 0, 999, 000, 999);
        assertEquals(grid.getBrightnessSum(), 2000000);
    }




    public void testTurnOnOperation() {
        Operation op = new TurnOnOperation();

        grid.executeOperation(op, 0, 999, 0, 0);
        assertEquals(1000, grid.getBrightnessSum());
    }

    public void testGridSize() {
        assertEquals(grid.getSize(), gridSize * gridSize);
    }

}
