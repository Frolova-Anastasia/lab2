package pokemons;

import moves.linoone.FurySwipes;
import ru.ifmo.se.pokemon.Type;

public class Linoone extends Zigzagoon {
    public Linoone(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(78, 70, 61, 50, 61, 100);


        FurySwipes furySwipes = new FurySwipes(18, 80);

        super.addMove(furySwipes);
    }
}
