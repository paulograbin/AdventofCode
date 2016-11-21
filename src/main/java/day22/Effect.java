package day22;

import lombok.Getter;
import lombok.Setter;


public class Effect {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String text;
    @Getter @Setter
    private int affectOnArmor;
    @Getter @Setter
    private int affectOnHealth;
    @Getter @Setter
    private int affectOnMana;
    @Getter
    private int duration;
    @Getter @Setter
    private int remainingTurns;
    @Getter @Setter
    private boolean isSelfEffect;
    @Getter @Setter
    private boolean oneTimer;

    public void setDuration(int duration) {
        this.remainingTurns = duration;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Effect{" +
                "name='" + name + '\'' +
                '}';
    }
}
