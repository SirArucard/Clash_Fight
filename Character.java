import abilities.Ability;

public class Character {
    private String nome;
    private int xp;
    private int nivel;
    private int vidaAtual;
    private int manaAtual;

    private CharClass modeloClasse;

    public Character(String nome, int xp, int nivel, int vidaAtual, int manaAtual, CharClass classe) {
        this.nome = nome;
        this.xp = xp;
        this.nivel = nivel;
        this.vidaAtual = vidaAtual;
        this.manaAtual = manaAtual;
        this.modeloClasse = classe;
    }

    public int getVidaAtual() {
        return this.vidaAtual;
    }

    public void receberDano(int dano) {
        this.vidaAtual -= dano;
        if (this.vidaAtual < 0) {
            this.vidaAtual = 0;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public CharClass getModeloClasse() {
        return this.modeloClasse;
    }

}