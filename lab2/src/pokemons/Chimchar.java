package pokemons;

import moves.chimchar.DoubleTeam;
import moves.chimchar.Leer;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Chimchar extends Pokemon {
    public Chimchar(String name, int level){
        super(name, level);
        super.setType(Type.FIRE);
        super.setStats(44, 58, 44, 58, 44, 61);

        DoubleTeam doubleTeam = new DoubleTeam(0,0);
        Leer leer = new Leer(0, 100);

        super.setMove(doubleTeam, leer);
    }
}
