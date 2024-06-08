package entities;
import inter.Ataque;

public class Guerreiro extends Personagem implements Ataque {
    private int dano;

    public Guerreiro(String nome, int pontosDeVida, int dano) {
        super(nome, pontosDeVida);
        this.dano = dano;
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " ataca " + alvo.getNome() + " com uma espada!");
        alvo.setPontosDeVida(alvo.getPontosDeVida() - dano);
        System.out.println(alvo.getNome() + " agora tem " + alvo.getPontosDeVida() + " pontos de vida.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Guerreiro: " + getNome() + " | Pontos de Vida: " + getPontosDeVida() + " | Força: " + dano);
    }
}
