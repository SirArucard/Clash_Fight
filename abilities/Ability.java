package abilities;
import monsters.Monster;
import Character;


public abstract class Ability {
    private String nomeAb;
    private int manaCusto;
    public abstract void usar(Object usuario, Monster alvo);

    public Ability(String nomeAb, int manaCusto) {
        this.nomeAb = nomeAb;
        this.manaCusto = manaCusto;
    }

    public String pegaNome() {
        return nomeAb;
    }

    public int pegaMana() {
        return manaCusto;
    }
    
}