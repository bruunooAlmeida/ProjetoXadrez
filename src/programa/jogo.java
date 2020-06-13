package programa;
import xadrez.PartidaDeXadrez;

public class jogo {
	public static void main (String[] args) {
		PartidaDeXadrez novoJogo = new PartidaDeXadrez();
		UI.mostraTabulheiro(novoJogo.getPecas());
		
		
	}
}
