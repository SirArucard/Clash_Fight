package abilities;
import entities.Character;
import monsters.Monster;

public class HealingAb extends Ability {
    private int cura;
    private int numCuras;

    public HealingAb(int cura, int numCuras, String nomeAb, int manaCusto) {
        super(nomeAb, manaCusto);
        this.cura = cura;
        this.numCuras = numCuras;
    }
    @Override
    public void usar(Object usuario, Monster alvo) {
        Character charUsuario = (Character) usuario;
        for(int i = 0; i < this.numCuras; i++) {
            System.out.println("Heal! You recover " + this.cura + " health!");
            charUsuario.receberCura(this.cura);
        }
    }

}