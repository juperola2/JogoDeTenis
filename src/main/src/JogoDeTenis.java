package main.src;

public class JogoDeTenis {
    private Jogador jogadorA;
    private Jogador jogadorB;
    private static final String[] pontuacao = {"0", "15", "30", "40"};

    public JogoDeTenis(Jogador jogadorA, Jogador jogadorB) {
        this.jogadorA = jogadorA;
        this.jogadorB = jogadorB;
    }

    public Jogador obterJogadorA() {
        return jogadorA;
    }

    public Jogador obterJogadorB() {
        return jogadorB;
    }

    public String obterPlacar() {
        int pontoDoJogadorA = jogadorA.obterPontuacao();
        int pontoDoJogadorB = jogadorB.obterPontuacao();

        if (ehDeuce(pontoDoJogadorA,pontoDoJogadorB))
            return "deuce";

      return  String.format("%s %s",obterPontuacaoDoJogador(jogadorA) ,obterPontuacaoDoJogador(jogadorB));
    }

    private boolean ehDeuce(int pontuacaoDoJogadorA, int pontuacaoDoJogadorB) {
        return pontuacaoDoJogadorA >= pontuacao.length-1 && pontuacaoDoJogadorA==pontuacaoDoJogadorB;
    }

    private String obterPontuacaoDoJogador(Jogador jogador) {
        return pontuacao[jogador.obterPontuacao()];
    }

    public void pontuarJogador(Jogador jogador) {
        jogador.pontuar();
    }
}
