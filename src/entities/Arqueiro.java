package entities;
import inter.Ataque;

public class Arqueiro extends Personagem implements Ataque {
    private int dano;

    public Arqueiro(String nome, int pontosDeVida, int dano) {
        super(nome, pontosDeVida);
        this.dano = dano;
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " ataca " + alvo.getNome() + " com uma flecha!");
        alvo.setPontosDeVida(alvo.getPontosDeVida() - dano);
        System.out.println(alvo.getNome() + " agora tem " + alvo.getPontosDeVida() + " pontos de vida.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Arqueiro: " + getNome() + " | Pontos de Vida: " + getPontosDeVida() + " | dano: " + dano);
    }
}
