package Servidor;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface JogoDaVelhaInterface {

	/**
	 * Funcão para entrar na partida
	 * @return a quantidade de jogadores logados no jogo
	 * @
	 */
	@WebMethod
	public int entrarNaPartida () ;
	/**
	 * Verifica se é a vez do jogador
	 * @param i
	 * @return true caso verdadeiro, false caso falso
	 * @
	 */
	
	@WebMethod
	public boolean isMinhaVez(int i);
	/**
	 * Verifica se a jogada é válida
	 * @param i
	 * @param posx
	 * @param posy
	 * @return  true caso verdadeiro, false caso falso
	 * @
	 */
	
	@WebMethod
	public boolean isJogadaValida(int i, int posx, int posy) ;
	/**
	 * Função para realizar a jogada de cada jogador
	 * @param i
	 * @param posx
	 * @param posy
	 * @return a string do tabuleiro a ser printado na tela
	 * @
	 */
	
	@WebMethod
	public String realizarJogada(int i, int posx, int posy ) ;
	/**
	 * Função para verificar se a partida foi encerrada
	 * @return true caso verdadeiro, false caso falso
	 * @
	 */
	
	@WebMethod
    public boolean isPartidaEncerrada() ;
    /**
     * Verifica se a partida foi encerrada
     * @return o jogador vencedor
     * @
     */
	
	@WebMethod
    public int resultadoPartida() ;
    /**
     * Verifica se há dois jogadores na partida
     * @return  true caso verdadeiro, false caso falso
     * @
     */
	
	@WebMethod
    public boolean isPronto() ;
    /**
     * Retorna o tabuleiro
     * @return tabuleiro
     * @
     */
	
	@WebMethod
    public String getTabuleiro() ;
    /**
     * Método para iniciar um novo jogo caso um dos jogadores queira.
     * @
     */
	
	@WebMethod
    public void newGame() ;
    
	@WebMethod
    public boolean ultrapassouTempo() ;
	
	
}
