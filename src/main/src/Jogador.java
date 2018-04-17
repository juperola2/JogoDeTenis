package main.src;

public class Jogador {

    private int pontuacao = 0;

    public void pontuar() {
        pontuacao++;
    }

    public int obterPontuacao() {
        return pontuacao;
    }
}
