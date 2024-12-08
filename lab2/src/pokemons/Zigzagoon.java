package pokemons;

import moves.zigzagoon.Facade;
import moves.zigzagoon.TailWhip;
import moves.zigzagoon.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zigzagoon extends Pokemon {
    public Zigzagoon(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(38, 30, 41, 30, 41, 60);

        TailWhip tailWhip = new TailWhip(0, 100);
        WorkUp workUp = new WorkUp(0, 0);
        Facade facade = new Facade(70, 100);

        super.setMove(tailWhip, workUp, facade);

    }
}
