package day2;

/**
 * Created by i841059 on 9/16/16.
 */
public class WrappingPaperCalculator {

    int length;
    int width;
    int height;

    public WrappingPaperCalculator(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int calculateAmountNeeded() {
        int amountOfPaperNeededForThePresent = 0;

        int dimension1 = calculateSideArea(length, width);
        int dimension2 = calculateSideArea(width, height);
        int dimension3 = calculateSideArea(height, length);

        int boxArea = dimension1 + dimension2 + dimension3;
        int smallestSide = getAreaOfTheSmallestSize(dimension1/2, dimension2/2, dimension3/2);

        amountOfPaperNeededForThePresent = boxArea + smallestSide;

        return amountOfPaperNeededForThePresent;
    }

    private int getAreaOfTheSmallestSize(int length, int width, int height) {
        int smallest = length;

        if(width < smallest)
            smallest = width;

        if (height < smallest)
            smallest = height;

        return smallest;
    }

    private int calculateSideArea(int dimension1, int dimension2) {
        return 2 * dimension1 * dimension2;
    }

}
