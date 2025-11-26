package monsters;

import java.util.Random;

public class Goblin extends Monster {

    public Goblin(String nomeMon, int vidaMon, int xpRec, int PodAtk) {
        super(nomeMon, vidaMon, xpRec, PodAtk);
    }

    @Override
    public void ataque() {
        System.out.println(this.pegaNome() + "laughs menacingly and swings its club!");
    }
}