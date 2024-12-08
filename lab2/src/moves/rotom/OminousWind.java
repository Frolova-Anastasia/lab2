package moves.rotom;

import ru.ifmo.se.pokemon.*;

public class OminousWind extends SpecialMove {
    public OminousWind(double pow, double acc){
        super(Type.GHOST, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = new Effect().chance(0.1).stat(Stat.DEFENSE, 1);
        p.addEffect(e);
        Effect e1 = new Effect().chance(0.1).stat(Stat.ATTACK, 1);
        p.addEffect(e1);
        Effect e2 = new Effect().chance(0.1).stat(Stat.SPECIAL_ATTACK, 1);
        p.addEffect(e2);
        Effect e3 = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, 1);
        p.addEffect(e3);
        Effect e4 = new Effect().chance(0.1).stat(Stat.SPEED, 1);
        p.addEffect(e4);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
    }

    @Override
    protected String describe(){
        return "uses Ominous Wind";
    }

}
