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


    public Effect makeCopy() {
        Effect e = new Effect();

        e.setText(this.getText());
        e.setName(this.getName());
        e.setAffectOnHealth(this.getAffectOnHealth());
        e.setAffectOnArmor(this.getAffectOnArmor());
        e.setAffectOnMana(this.getAffectOnMana());
        e.setDuration(this.getDuration());
        e.setRemainingTurns(this.getRemainingTurns());
        e.setSelfEffect(this.isSelfEffect());
        e.setOneTimer(this.isOneTimer());

        return e;
    }

    public void setDuration(int duration) {
        this.remainingTurns = duration;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Effect{" + "name='" + name + ", duration=" + duration + ", remaining="+remainingTurns+'}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Effect effect = (Effect) o;

        if (isSelfEffect != effect.isSelfEffect) return false;
        if (oneTimer != effect.oneTimer) return false;
        return name.equals(effect.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (isSelfEffect ? 1 : 0);
        result = 31 * result + (oneTimer ? 1 : 0);
        return result;
    }
}
