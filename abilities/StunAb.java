package abilities;
import monsters.Monster;
import Character;


public class StunAb extends Ability {
    private int dano;
    private int chanceStun;
    private int duracaoStun;

    public StunAb(int dano, int chanceStun, int duracaoStun, String nomeAb, int manaCusto) {
        super(nomeAb, manaCusto);
        this.dano = dano;
        this.chanceStun = chanceStun;
        this.duracaoStun = duracaoStun;
    }
    @Override
    public void usar(Object usuario, Monster alvo) {
        System.out.println("Strike! You deal " + this.dano + " damage!");
        alvo.recebeDano(this.dano);
        int valorSorteado = (int) (Math.random() * 100) + 1;
        if (valorSorteado <= this.chanceStun) {
            alvo.aplicarStun(this.duracaoStun);
            System.out.println("Stun applied for " + this.duracaoStun + " turns!");
        } else {
            System.out.println("Stun failed!"); 

}