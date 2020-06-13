package pecasDeXadrez;

import tabulheiro.Board;
import xadrez.Color;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez {

	public Torre(Board board, Color cor) {
		super(board, cor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString () {
		return "T";
	}
	
}
