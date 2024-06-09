package application;
import java.util.Random;
import java.util.Scanner;
import entities.*;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Jogador 1 escolha o personagem:");
        System.out.println("1. Guerreiro");
        System.out.println("2. Arqueiro");
        System.out.println("3. Mago");

        int escolhaClasse1 = scanner.nextInt();
        System.out.println("Nome:");
        String nome1 = scString.nextLine();
        Personagem jogador1;
        switch (escolhaClasse1) {
            case 1:
            jogador1 = new Guerreiro(nome1, 100, 10);
            break;
            case 2:
            jogador1 = new Arqueiro(nome1, 80, 15);
            break;
            case 3:
            jogador1 = new Mago(nome1, 70, 25);
            break;
            default:
            System.out.println("Escolha inválida, selecionando Guerreiro por padrão.");
            jogador1 = new Guerreiro(nome1, 100, 20);
            break;
            }
            System.out.println("Jogador 2 escolha o personagem:");
            System.out.println("1. Guerreiro");
            System.out.println("2. Arqueiro");
            System.out.println("3. Mago");
            int escolhaClasse2 = scanner.nextInt();
            System.out.println("Nome:");
            String nome2 = scString.nextLine();
            Personagem jogador2;
            
            switch (escolhaClasse2) {
                case 1:
                jogador2 = new Guerreiro(nome2, 100, 10);
                break;
            case 2:
                jogador2 = new Arqueiro(nome2, 80, 15);
                break;
            case 3:
                jogador2 = new Mago(nome2, 70, 25);
                break;
            default:
                System.out.println("Escolha inválida, selecionando Guerreiro por padrão.");
                jogador2 = new Guerreiro(nome2, 100, 20);
                break;
        }
        limpaTela();

        jogador1.exibirInfo();
        jogador2.exibirInfo();

        System.out.println("\nBatalha Inicia!\n");

        while (jogador1.getPontosDeVida() > 0 && jogador2.getPontosDeVida() > 0) {
            // Turno do Jogador
            System.out.println(jogador1.getNome() + ", adivinhe um número entre 1 e 3:");
            int escolhaJogador = scanner.nextInt();
            int numeroSorteado = random.nextInt(3) + 1;
            limpaTela();

            if (escolhaJogador == numeroSorteado) {
                jogador1.atacar(jogador2);
            } else {
                System.out.println("Número errado! " + jogador1.getNome() + " não ataca.");
            }

            // Exibir barras de vida
            jogador1.exibirBarraDeVida();
            jogador2.exibirBarraDeVida();

            if (jogador2.getPontosDeVida() <= 0) {
                System.out.println(jogador2.getNome() + " foi derrotado! " + jogador1.getNome() + " venceu!");
            }

            // Turno do jogador2
            System.out.println(jogador2.getNome() + ", adivinhe um número entre 1 e 3:");
            escolhaJogador = scanner.nextInt();
            numeroSorteado = random.nextInt(3) + 1;

            if (escolhaJogador == numeroSorteado) {
                jogador2.atacar(jogador1);
            } else {
                System.out.println("Número errado! " + jogador2.getNome() + " não ataca.");
            }

            // Exibir barras de vida
            jogador1.exibirBarraDeVida();
            jogador2.exibirBarraDeVida();

            if (jogador1.getPontosDeVida() <= 0) {
                System.out.println(jogador1.getNome() + " foi derrotado! " + jogador2.getNome() + " venceu!");
            }
        }

        scanner.close();
        scString.close();
    }

    public static void limpaTela(){
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
    }
}
