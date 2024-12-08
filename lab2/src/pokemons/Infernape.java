package pokemons;


import moves.infernape.RockSlide;
import ru.ifmo.se.pokemon.Type;

public class Infernape extends Monferno {
    public Infernape(String name, int level){
        super(name, level);
        super.setType(Type.FIRE, Type.FIGHTING);
        super.setStats(76, 104, 71, 104, 71, 108);

        RockSlide rockSlide = new RockSlide(75, 90);

        super.addMove(rockSlide);
    }
}
