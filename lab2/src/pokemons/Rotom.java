package pokemons;

import moves.rotom.DarkPulse;
import moves.rotom.DreamEater;
import moves.rotom.OminousWind;
import moves.rotom.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Rotom extends Pokemon {
    public Rotom(String name, int level){
        super(name, level);
        super.setType(Type.ELECTRIC, Type.GHOST);
        super.setStats(50, 50, 77, 95, 77, 91);

        OminousWind ominousWind = new OminousWind(60, 100);
        DreamEater dreamEater = new DreamEater(100, 100);
        Thunderbolt thunderbolt = new Thunderbolt(90, 100);
        DarkPulse darkPulse = new DarkPulse(80, 100);

        super.setMove(ominousWind, dreamEater, thunderbolt, darkPulse);
    }
}
