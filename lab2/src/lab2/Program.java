package lab2;

import pokemons.*;
import ru.ifmo.se.pokemon.Battle;


public class Program {
    public static void main(String[] args) {
            Battle b = new Battle();
            Zigzagoon zigzagoon = new Zigzagoon("Zig", 1);
            Rotom rotom = new Rotom("Rot", 1);
            Linoone linoone = new Linoone("Lin", 1);
            Chimchar chimchar = new Chimchar("Chim", 1);
            Monferno monferno = new Monferno("Mony", 1);
            Infernape infernape = new Infernape("Inf", 1);

            b.addAlly(zigzagoon);
            b.addAlly(chimchar);
            b.addAlly(monferno);
            b.addFoe(rotom);
            b.addFoe(linoone);
            b.addFoe(infernape);
            b.go();
        }

        public static boolean chance(double num) {
            return num >= Math.random();
        }
    }

