package test.main;

import main.src.Jogador;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JogadorTeste {

    @Test
    public void deve_criar_um_jogador() {
        Jogador jogadorCriado = new Jogador();

        assertNotNull(jogadorCriado);
    }

    @Test
    public void deve_pontuar_um_jogador(){
        int pontuacaoEsperada = 1;
        Jogador jogador = new Jogador();

        jogador.pontuar();

        assertEquals(pontuacaoEsperada, jogador.obterPontuacao());
    }

    @Test
    public void ao_criar_um_jogador_deve_ter_pontuacao_zerada() {
        Jogador jogador = new Jogador();

        assertEquals(0, jogador.obterPontuacao());
    }
}
