package moves.zigzagoon;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected void applyOppDamage (Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
        if (def.getCondition() == Status.POISON || def.getCondition() == Status.PARALYZE) {
            super.applyOppDamage(def, damage * 2);
        }
    }

    @Override
    protected String describe() {
        return "uses Facade";
    }
}
