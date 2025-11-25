public class Ability {
    private String nome;
    private int manaCusto;
    private int danoValor;

    public Ability(String nome, int manaCusto, int danoValor) {
        this.nome = nome;
        this.manaCusto = manaCusto;
        this.danoValor = danoValor;
    }
    public String pegaNome() {
        return nome;
    }
    public int pegaMana() {
        return manaCusto;
    }
    public int pegaDano() {
        return danoValor;
    }
}