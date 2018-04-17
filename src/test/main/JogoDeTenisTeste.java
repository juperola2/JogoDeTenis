package test.main;

import main.src.Jogador;
import main.src.JogoDeTenis;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class JogoDeTenisTeste {

    private Jogador jogadorA;
    private Jogador jogadorB;

    @Before
    public void setUp() throws Exception {
        jogadorA = new Jogador();
        jogadorB = new Jogador();

    }

    @Test
    public void deve_criar_um_jogo_de_tenis_com_dados_consistentes() {

        JogoDeTenis jogoDeTenisCriado = new JogoDeTenis(jogadorA, jogadorB);

        assertThat(jogoDeTenisCriado.obterJogadorA(), is(jogadorA));
        assertThat(jogoDeTenisCriado.obterJogadorB(), is(jogadorB));
    }

    @Test
    public void deve_obter_o_placar_do_jogo(){
        JogoDeTenis jogoDeTenisCriado = new JogoDeTenis(jogadorA, jogadorB);

        assertEquals("0 0", jogoDeTenisCriado.obterPlacar());
    }

    @Test
    public void deve_pontuar_um_jogador() {
        JogoDeTenis jogoDeTenisCriado = new JogoDeTenis(jogadorA, jogadorB);

        jogoDeTenisCriado.pontuarJogador(jogadorA);

        assertEquals("15 0", jogoDeTenisCriado.obterPlacar());
    }

    @Test
    public void deve_informar_placar_em_situacao_de_deuce(){
        JogoDeTenis jogoDeTenisCriado = new JogoDeTenis(jogadorA, jogadorB);
        jogoDeTenisCriado.pontuarJogador(jogadorA);
        jogoDeTenisCriado.pontuarJogador(jogadorA);
        jogoDeTenisCriado.pontuarJogador(jogadorA);
        jogoDeTenisCriado.pontuarJogador(jogadorB);
        jogoDeTenisCriado.pontuarJogador(jogadorB);
        jogoDeTenisCriado.pontuarJogador(jogadorB);

        assertEquals("deuce", jogoDeTenisCriado.obterPlacar());
    }

    @Test
    public void deve_informar_o_vencedor(){

    }
}
