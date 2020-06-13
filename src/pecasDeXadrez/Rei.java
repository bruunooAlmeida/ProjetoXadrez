package pecasDeXadrez;

import tabulheiro.Board;
import xadrez.Color;
import xadrez.PecaXadrez;

public class Rei extends PecaXadrez {

	public Rei(Board board, Color cor) {
		super(board, cor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString () {
		return "R";
	}
	
}
