package day6.secondHalf;

/**
 * Created by paulograbin on 27/04/16.
 */
public class TurnOffOperation implements Operation {

    public void execute(Light light) {
        light.turnOff();
    }
}
