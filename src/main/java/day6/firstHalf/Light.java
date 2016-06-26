package day6.firstHalf;

/**
 * Created by paulograbin on 27/04/16.
 */
public class Light {


    public enum State {
        ON, OFF
    }

    State state;

    public Light() {
        state = State.OFF;
    }


    public void turnOn() {
        state = State.ON;
    }

    public void turnOff() {
        state = State.OFF;
    }

    public void toggle() {
        if(state.equals(State.ON))
            state = State.OFF;
        else
            state = State.ON;

    }

    public State getState() {
        return state;
    }
}
