package day6.secondHalf;

/**
 * Created by paulograbin on 27/04/16.
 */
public class Light {

    int brightness;

    public Light() {
        brightness = 0;
    }


    public void turnOn() {
        brightness = brightness + 1;
    }

    public void turnOff() {
        if(brightness > 0) {
            brightness = brightness - 1;
        }
    }

    public void toggle() {
        brightness = brightness + 2;
    }

    public int getBrightness() {
        return brightness;
    }
}
