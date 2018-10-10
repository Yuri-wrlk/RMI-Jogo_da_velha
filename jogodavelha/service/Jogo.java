package service;

public class Jogo{
	private Tabuleiro tabuleiro;
	private int jogadorDaVez = 1;
	private int numJogadores = 0;
	private long DURACAO_MAXIMA = 45 * 1000;
	private long horarioInicio = System.currentTimeMillis();
	
	/**
	 * Construtor...
	 * @ 
	 */
	public Jogo()  {
		tabuleiro = new Tabuleiro();
	}

	
	public int entrarNaPartida( )  {
		if(numJogadores < 2)
			return ++numJogadores;
		else
			return -1;
	}

	
	public boolean isMinhaVez(int i)  {
		return i == jogadorDaVez;
	}

	
	public boolean isJogadaValida(int i, int posx, int posy)  {
		return posx <= 3 && posx >= 1 && posy <= 3 && posy >= 1 && tabuleiro.getPosicao(posx, posy) == 0;			
	}

	
	public String realizarJogada(int i, int posx, int posy)  {
		
		tabuleiro.setPosicao(posx,  posy, i);
		jogadorDaVez = (jogadorDaVez % 2) + 1;
		
		horarioInicio = System.currentTimeMillis();
		System.out.print("Horario de inicio: ");
		System.out.println(horarioInicio);
		return tabuleiro.toString();
	}

	
	public boolean isPartidaEncerrada()  {
		return tabuleiro.checagemDeColunas() != 0 
				|| tabuleiro.checagemDeLinhas() != 0
				|| tabuleiro.checagemDeDiagonais() != 0
				|| tabuleiro.tabuleiroPreenchido()
				|| ultrapassouTempo();
		
	}

	
	public int resultadoPartida()  {
		int vencedor = 0;
		int resultColunas = tabuleiro.checagemDeColunas();
		int resultLinhas = tabuleiro.checagemDeLinhas();
		int resultDiagonais = tabuleiro.checagemDeDiagonais();
		if( resultColunas != 0)
			vencedor = resultColunas;
		else if (resultLinhas != 0)
			vencedor = resultLinhas;
		else if (resultDiagonais != 0)
			vencedor = resultDiagonais;
		else if (ultrapassouTempo())
			return (jogadorDaVez % 2) + 1;
		return vencedor == -1 ? 1 : vencedor == 1 ? 2 : 0;	
	}
	
	
	public boolean ultrapassouTempo() {
		System.out.print("O tempo passado em milissegundos � ");
		System.out.println(System.currentTimeMillis() - horarioInicio);
		return (System.currentTimeMillis() - horarioInicio) >= DURACAO_MAXIMA;
	}

	
	public boolean isPronto()  {
		return numJogadores == 2;
	}

	
	public String getTabuleiro()  {
		return tabuleiro.toString();
	}

	
	public void newGame()  {
		if(numJogadores != 1) {
			numJogadores = 0;
			tabuleiro.zerarTabuleiro();
			jogadorDaVez = 1;
			horarioInicio = System.currentTimeMillis();
		}
	}
}
