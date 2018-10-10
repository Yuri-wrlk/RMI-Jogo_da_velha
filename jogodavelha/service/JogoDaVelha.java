package service;

import java.rmi.RemoteException;

import javax.jws.WebService;

@WebService(endpointInterface = "service.JogoDaVelhaInterface")
public class JogoDaVelha implements JogoDaVelhaInterface{

	private static Jogo jogo;
	
	static {
		jogo = new Jogo();	
	}
	
	public JogoDaVelha() throws RemoteException {
		super();		
	}

	@Override
	public int entrarNaPartida() {
		return jogo.entrarNaPartida();
	}

	@Override
	public boolean isMinhaVez(int i) {
		return jogo.isMinhaVez(i);
	}

	@Override
	public boolean isJogadaValida(int i, int posx, int posy) {
		return jogo.isJogadaValida(i, posx, posy);
	}

	@Override
	public String realizarJogada(int i, int posx, int posy) {
		return jogo.realizarJogada(i, posx, posy);
	}

	@Override
	public boolean isPartidaEncerrada() {
		return jogo.isPartidaEncerrada();
	}

	@Override
	public int resultadoPartida() {
		return jogo.resultadoPartida();
	}

	@Override
	public boolean isPronto() {
		return jogo.isPronto();
	}

	@Override
	public String getTabuleiro() {
		return jogo.getTabuleiro();
	}

	@Override
	public void newGame() {
		jogo.newGame();
	}

	@Override
	public boolean ultrapassouTempo() {
		return jogo.ultrapassouTempo();
	}
	
}
