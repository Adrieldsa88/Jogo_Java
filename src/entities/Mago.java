package entities;
import inter.Ataque;

public class Mago extends Personagem implements Ataque {
    private int dano;

    public Mago(String nome, int pontosDeVida, int dano) {
        super(nome, pontosDeVida);
        this.dano = dano;
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " lança uma bola de fogo em " + alvo.getNome() + "!");
        alvo.setPontosDeVida(alvo.getPontosDeVida() - dano);
        System.out.println(alvo.getNome() + " agora tem " + alvo.getPontosDeVida() + " pontos de vida.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Mago: " + getNome() + " | Pontos de Vida: " + getPontosDeVida() + " | dano: " + dano);
    }
}

