package moves.zigzagoon;

import ru.ifmo.se.pokemon.*;

public class TailWhip extends StatusMove {
    public TailWhip(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.DEFENSE, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "uses Tail Whip";
    }
}