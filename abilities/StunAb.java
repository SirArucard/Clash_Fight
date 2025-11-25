package abilities;

public class StunAb extends Ability{
    private int dano;
    private int chanceStun;
    private int duracaoStun;

    public StunAb(int dano, int chanceStun, int duracaoStun, String nomeAb, int manaCusto){
        super(nomeAb, manaCusto);
        this.dano = dano;
        this.chanceStun = chanceStun;
        this.duracaoStun = duracaoStun;
    }

}