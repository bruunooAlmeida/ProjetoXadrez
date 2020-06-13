package xadrez;
import tabulheiro.Board;
import tabulheiro.Peca;

public class PecaXadrez extends Peca {
	
	private Color cor;
	
	public PecaXadrez(Board board,Color cor) {
		super(board);
		this.cor = cor;
	}
	
	public Color getCor() {
		return cor;
	}
	
	
}
