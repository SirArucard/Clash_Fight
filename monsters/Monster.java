package monsters;

public abstract class Monster {
    private String nomeMon;
    private int vidaMon;
    private int vidaAtual;
    private int xpRec;
    private int PodAtk;

    public abstract void ataque();

    public Monster(String nomeMon, int vidaMon, int xpRec, int PodAtk) {
        this.nomeMon = nomeMon;
        this.vidaMon = vidaMon;
        this.vidaAtual = vidaMon;
        this.xpRec = xpRec;
        this.PodAtk = PodAtk;
    }

    public String pegaNome() {
        return nomeMon;
    }

    public int pegaVida() {
        return vidaMon;
    }

    public int pegaXP() {
        return xpRec;
    }

    public int PodAtk() {
        return PodAtk;
    }

    public void recebeDano(int danoRecebido) {
        this.vidaAtual -= danoRecebido;
    }

    public int pegaVidaAtual() {
    return this.vidaAtual;
    }

}