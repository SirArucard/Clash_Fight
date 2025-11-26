package abilities;
import monsters.Monster;

public class DamageAb extends Ability {
    private int dano;
    private int numAtaques;

    public DamageAb(int dano, int numAtaques, String nomeAb, int manaCusto) {
        super(nomeAb, manaCusto);
        this.dano = dano;
        this.numAtaques = numAtaques;
    }

    @Override
    public void usar(Object usuario, Monster alvo) {
        for(int i = 0; i < this.numAtaques; i++) {
            System.out.println("Strike! You deal " + this.dano + " damage!");
            alvo.recebeDano(this.dano);
        }

}