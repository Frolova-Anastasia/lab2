package moves.monferno;

import ru.ifmo.se.pokemon.*;

public class SlackOff extends StatusMove {
    public SlackOff(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.HP, 1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "uses Slack off";
    }
}