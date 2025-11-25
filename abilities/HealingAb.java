package abilities;

public class HealingAb extends Ability{
    private int cura;
    private int numCuras;

    public HealingAb(int cura, int numCuras, String nomeAb, int manaCusto){
        super(nomeAb, manaCusto);
        this.cura = cura;
        this.numCuras = numCuras;
    }

}