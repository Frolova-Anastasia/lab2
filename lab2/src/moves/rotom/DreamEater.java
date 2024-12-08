package moves.rotom;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double power) {
        if (p.getCondition() == Status.SLEEP) {
            super.applyOppDamage(p, power);
        }
    }

    @Override
    protected void applySelfDamage(Pokemon p, double power) {
        p.setMod(Stat.HP, (int) (-(power / (double) 2))); //добавляем половину HP
    }

    @Override
    protected String describe() {
        return "uses Dream Eater";
    }
}
