package pokemons;

import moves.monferno.SlackOff;
import ru.ifmo.se.pokemon.Type;

public class Monferno extends Chimchar {
    public Monferno(String name, int level){
        super(name, level);
        super.setType(Type.FIRE, Type.FIGHTING);
        super.setStats(64, 78, 52, 78, 52, 81);

        SlackOff slackOff = new SlackOff(0,0);

        super.addMove(slackOff);
    }
}
