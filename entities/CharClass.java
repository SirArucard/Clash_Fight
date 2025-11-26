package entities;
import abilities.Ability;

public class CharClass {
    private String nome;
    private int vidaBase;
    private int manaBase;
    private int def;

    private Ability ability1;
    private Ability ability2;

    public CharClass(String nome, int vidaBase, int manaBase, int def, Ability ab1, Ability ab2) {
        this.nome = nome;
        this.vidaBase = vidaBase;
        this.manaBase = manaBase;
        this.def = def;
        this.ability1 = ab1;
        this.ability2 = ab2;
    }

    public String getNome() {
        return nome;
    }

    public int getVidaBase() {
        return vidaBase;
    }

    public int getManaBase() {
        return manaBase;
    }

    public int getDef() {
        return def;
    }

    public Ability getAbility1() {
        return ability1;
    }

    public Ability getAbility2() {
        return ability2;
    }
}