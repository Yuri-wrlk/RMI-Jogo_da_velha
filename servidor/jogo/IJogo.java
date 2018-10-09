package jogo;


public interface IJogo {

	/**
	 * Funcão para entrar na partida
	 * @return a quantidade de jogadores logados no jogo
	 * @
	 */
	public int entrarNaPartida () ;
	/**
	 * Verifica se é a vez do jogador
	 * @param i
	 * @return true caso verdadeiro, false caso falso
	 * @
	 */
	public boolean isMinhaVez(int i);
	/**
	 * Verifica se a jogada é válida
	 * @param i
	 * @param posx
	 * @param posy
	 * @return  true caso verdadeiro, false caso falso
	 * @
	 */
	public boolean isJogadaValida(int i, int posx, int posy) ;
	/**
	 * Função para realizar a jogada de cada jogador
	 * @param i
	 * @param posx
	 * @param posy
	 * @return a string do tabuleiro a ser printado na tela
	 * @
	 */
	public String realizarJogada(int i, int posx, int posy ) ;
	/**
	 * Função para verificar se a partida foi encerrada
	 * @return true caso verdadeiro, false caso falso
	 * @
	 */
    public boolean isPartidaEncerrada() ;
    /**
     * Verifica se a partida foi encerrada
     * @return o jogador vencedor
     * @
     */
    public int resultadoPartida() ;
    /**
     * Verifica se há dois jogadores na partida
     * @return  true caso verdadeiro, false caso falso
     * @
     */
    public boolean isPronto() ;
    /**
     * Retorna o tabuleiro
     * @return tabuleiro
     * @
     */
    public String getTabuleiro() ;
    /**
     * Método para iniciar um novo jogo caso um dos jogadores queira.
     * @
     */
    public void newGame() ;
    
    public boolean ultrapassouTempo() ;
}
