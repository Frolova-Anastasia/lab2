package moves.zigzagoon;

import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove {
    public WorkUp(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.ATTACK, 1);
        p.addEffect(e);
        Effect e1 = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
        p.addEffect(e1);
    }

    @Override
    protected String describe() {
        return "uses Work Up";
    }
}
