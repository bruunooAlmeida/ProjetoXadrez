package xadrez;

import tabulheiro.Board;

public class PartidaDeXadrez {
	private Board board;
	
	public PartidaDeXadrez() {
		board = new Board(8,8);
	}
	
	public PecaXadrez[][] getPecas(){
		   PecaXadrez[][] mat = new PecaXadrez[board.getLinhas()][board.getColunas()];
		   for (int i = 0; i < board.getLinhas(); i++) {
			   for (int j = 0; j < board.getColunas(); j++) {
				mat[i][j] = (PecaXadrez) board.peca(i,j);
			}
			
		}
		   return mat;
		
	}
}
