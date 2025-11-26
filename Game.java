import java.util.Random;
import monster.Monster;
import java.util.Scanner;
import abilities.*;
import monsters.Goblin;

public class Game {
    private Character hero;
    private Monster inimigo;
    private Random gerador;

    public Game() {
        this.gerador = new Random();
    }

    public void start() {
        Scanner ler = new Scanner(System.in);
        CharClass classeEscolhida = null;

        System.out.println("Welcome to Clash Battle!");
        System.out.println("A turn-based RPG");
        System.out.println("What's your name my fellah? ");
        String nomeHero = ler.nextLine();

        System.out.println("\nNow chose your class:");
        System.out.println("1 - Warrior");
        System.out.println("2 - Mage");
        System.out.println("3 - Rogue");
        System.out.print("You choose: ");
        int escolha = ler.nextInt();
        System.out.print("\n Good Luck, and have some fun!");

        switch (escolha) {
            case 1:
                Ability slash = new DamageAb(15, 1, "Slash!", 5);
                Ability stunBasico = new StunAb(5, 50, 1, "Shield Bash", 8);
                classeEscolhida = new CharClass("Warrior", 100, 20, 10, slash, stunBasico);
                break;

            case 2:
                Ability fireball = new DamageAb(16, 1, "Fireball", 10);
                Ability heal = new HealingAb(20, 1, "Curaga", 20);
                classeEscolhida = new CharClass("Mage", 60, 40, 5, fireball, heal);
                break;

            case 3:
                Ability doubleAttack = new DamageAb(10, 2, "Double Attack", 7);
                Ability arrowShot = new DamageAb(15, 1, "Arrow Shot", 3);
                classeEscolhida = new CharClass("Rogue", 80, 20, 8, doubleAttack, arrowShot);
                break;

            default:
                System.out.println("Invalid class! You are now a Deprived.");
                classeEscolhida = new CharClass("Deprived", 50, 0, 0, new DamageAb(1, 1, "Slap", 0),
                        new DamageAb(1, 1, "Cry", 0));
                break;
        }
        this.hero = new Character(nomeHero, 0, 1,
                classeEscolhida.getVidaBase(),
                classeEscolhida.getManaBase(),
                classeEscolhida);

        System.out.println("\nGood Luck, " + nomeHero + " the " + classeEscolhida.getNome() + "!");
        batalha();
    }

    public void batalha() {
        Scanner ler = new Scanner(System.in);

        this.inimigo = new Goblin("Goblin", 50, 20, 5);

        if (this.inimigo == null) {
            System.out.println("Erro: Nenhum monstro criado para lutar.");
            return;
        }

        System.out.println("\n--- BATTLE START ---");
        System.out.println("A Wild " + inimigo.pegaNome() + " Appears");

        while (this.heroi.getVidaAtual() > 0 && this.inimigo.pegaVidaAtual() > 0) {

            // --- STATUS ---
            System.out.println("\n" + heroi.getNome() + " (HP: " + heroi.getVidaAtual() + ") vs " +
                    inimigo.pegaNome() + " (HP: " + inimigo.pegaVida() + ")");

            // --- TURNO DO JOGADOR ---
            System.out.println("Choose your action:");
            System.out.println("1. Base Attack");
            System.out.println("2. " + heroi.getModeloClasse().getAbility1().pegaNome());
            System.out.println("3. " + heroi.getModeloClasse().getAbility2().pegaNome());
            System.out.print("> ");
            int acao = ler.nextInt();

            if (acao == 1) {
                System.out.println("You attacked!");
                inimigo.recebeDano(10);
            } else {
                System.out.println("You use an ability");
                inimigo.recebeDano(20);
            }

            if (inimigo.pegaVidaAtual() <= 0) {
                System.out.println("\nVICTORY! The " + inimigo.pegaNome() + " was defeated!");
                break;
            }

            System.out.println("\nO " + inimigo.pegaNome() + " attacks!");
            inimigo.ataque();
            heroi.receberDano(inimigo.PodAtk());
            System.out.println("He deal " + inimigo.PodAtk() + " damage.");

            if (heroi.getVidaAtual() <= 0) {
                System.out.println("\nYou died... Game Over.");
                break;
            }
        }
    }
}