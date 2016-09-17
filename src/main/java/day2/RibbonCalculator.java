package day2;

/**
 * Created by i841059 on 9/17/16.
 */
public class RibbonCalculator {

    int length;
    int width;
    int height;

    public RibbonCalculator(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int calculateAmountNeeded() {
        return calculateBow() + calculateWrap();
    }

    private int calculateBow() {
        return length * width * height;
    }

    private int calculateWrap() {
        if(length >= width)
            if(length >= height)
                return width*2 + height*2;
            else
                return length*2 + width*2;
        else if (width >= height)
            return length*2 + height*2;
        else
            return length*2 + width*2;
    }

}
