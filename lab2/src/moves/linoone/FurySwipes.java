package moves.linoone;

import lab2.Program;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class FurySwipes extends PhysicalMove {
    public FurySwipes(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage);
        if(Program.chance(3d/8d)){
            super.applyOppDamage(def, damage*2);
        }
        if(Program.chance(3d/8d)){
            super.applyOppDamage(def, damage*3);
        }
        if(Program.chance(1d/8d)){
            super.applyOppDamage(def, damage*4);
        }
        if(Program.chance(1d/8d)){
            super.applyOppDamage(def, damage*5);
        }

    }
    @Override
    protected String describe() {
        return "uses Fury Swipes";
    }
}
