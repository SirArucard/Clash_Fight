package abilities;

public class DamageAb extends Ability{
    private int dano;
    private int numAtaques;

    public DamageAb(int dano, int numAtaques, String nomeAb, int manaCusto){
        super(nomeAb, manaCusto);
        this.dano = dano;
        this.numAtaques = numAtaques;
    }

}