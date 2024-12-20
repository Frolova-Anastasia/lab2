package moves.chimchar;

import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove {
    public Leer(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.DEFENSE, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "uses Leer";
    }
}
