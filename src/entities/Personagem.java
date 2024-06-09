package entities;

public abstract class Personagem {
    private String nome;
    private int pontosDeVida;
    private int pontosDeVidaMax;

    public Personagem(String nome, int pontosDeVida) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.pontosDeVidaMax = pontosDeVida;
    }

    public String getNome() {
        return nome;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public abstract void atacar(Personagem alvo);

    public abstract void exibirInfo();

    public void exibirBarraDeVida() {
        int totalCaracteres = 20;
        if(pontosDeVida < 0){
            System.out.println(getNome()+"[] 0/"+pontosDeVidaMax);
        }
        else{
            int caracteresPreenchidos = (int) ((double) pontosDeVida / pontosDeVidaMax * totalCaracteres);
            String barraDeVida = new String(new char[caracteresPreenchidos]).replace("\0", "=") +
                                 new String(new char[totalCaracteres - caracteresPreenchidos]).replace("\0", " ");
            System.out.println(getNome() + ": [" + barraDeVida + "] " + pontosDeVida + "/" + pontosDeVidaMax);
        }
    }
}
