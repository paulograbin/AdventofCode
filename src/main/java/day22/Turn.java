package day22;

import lombok.Getter;
import lombok.Setter;


public class Turn {

    @Getter @Setter
    private int number;
    @Getter @Setter
    private Spell spellUsedByPlayer;
    @Getter @Setter
    private Player player;
    @Getter @Setter
    private Player opponent;


    public Turn(int number, Player player, Player opponent) {
        this.number = number;
        this.player = player;
        this.opponent = opponent;
    }

    public void playTurn() {
        if(playersHaveEffectOn()) {
            applyEffects();
        }

        TurnAttack attack = player.playTurn();

        if(isAttackPhysical(attack)) {
            System.out.println("Boss attacks for " + attack.getDamage() + " - " + opponent.getArmor() + " = " + (attack.getDamage() - opponent.getArmor()));
            opponent.setHealth(opponent.getHealth() - (attack.getDamage() - opponent.getArmor()));
        } else {
            applySpellEffects(attack.getSpell());
        }
    }

    public boolean isAttackPhysical(TurnAttack attack) {
        return attack.getDamage() > 0;
    }


    private void applySpellEffects(Spell spellUsedByPlayer) {
        if(spellUsedByPlayer.getEffect() != null) {
            Effect currentEffect = spellUsedByPlayer.getEffect();

            if(currentEffect.isSelfEffect())
                player.addEffect(currentEffect);
            else
                opponent.addEffect(currentEffect);

        } else {
            opponent.setHealth(opponent.getHealth() - spellUsedByPlayer.getDamage());
            player.setHealth(player.getHealth() + spellUsedByPlayer.getHealth());
        }
    }

    private void applyEffects() {
        applyEffectsOnPlayer(player);
        applyEffectsOnPlayer(opponent);
    }

    private void applyEffectsOnPlayer(Player targetOfTurn) {
        for(int i = 0; i < targetOfTurn.getCurrentEffects().size(); i++) {
            Effect effect = targetOfTurn.getCurrentEffects().get(i);

            if(effect.isOneTimer() && (effect.getRemainingTurns() != effect.getDuration())) {
                removeEffectIfDurationExpired(targetOfTurn, effect);
            }
            else {
                targetOfTurn.setHealth(targetOfTurn.getHealth() + effect.getAffectOnHealth());
                targetOfTurn.setMana(targetOfTurn.getMana() + effect.getAffectOnMana());
                targetOfTurn.setArmor(targetOfTurn.getArmor() + effect.getAffectOnArmor());
            }

            effect.setRemainingTurns(effect.getRemainingTurns()-1);

            removeEffectIfDurationExpired(targetOfTurn, effect);
        }
    }

    private void removeEffectIfDurationExpired(Player player, Effect effect) {
        if(effect.getRemainingTurns() == 0) {
            player.removeEffect(effect);

            if(effect.getAffectOnArmor() == 7)
                player.setArmor(player.getArmor() -7);
        }
    }

    private boolean playersHaveEffectOn() {
        return player.getCurrentEffects().size() > 0 || opponent.getCurrentEffects().size() > 0;
    }
}
