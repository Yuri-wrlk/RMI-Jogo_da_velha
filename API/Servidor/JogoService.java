package Servidor;

import java.rmi.RemoteException;

import javax.jws.WebService;

import jogo.IJogo;
import jogo.Jogo;
import jogo.Tabuleiro;

@WebService(endpointInterface = "service.ConversaoTemperaturaInterface")
public class JogoService implements IJogo{

	private static Jogo jogo;
	
	static {
		jogo = new Jogo();	
	}
	
	public JogoService() throws RemoteException {
		super();
		
	}

	@Override
	public int entrarNaPartida() {
		
		return 0;
	}

	@Override
	public boolean isMinhaVez(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isJogadaValida(int i, int posx, int posy) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String realizarJogada(int i, int posx, int posy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPartidaEncerrada() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int resultadoPartida() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isPronto() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getTabuleiro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void newGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ultrapassouTempo() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
