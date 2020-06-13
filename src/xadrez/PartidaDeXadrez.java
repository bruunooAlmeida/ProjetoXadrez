package xadrez;

import pecasDeXadrez.Torre;
import tabulheiro.Board;
import tabulheiro.Posicao;

public class PartidaDeXadrez {
	private Board board;
	
	public PartidaDeXadrez() {
		board = new Board(8,8);
		inicioPartida();
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
	
	private void inicioPartida() {
		board.colocarPecaTabulheiro(new Torre(board, Color.BLACK), new Posicao(2,1));
	}
}
