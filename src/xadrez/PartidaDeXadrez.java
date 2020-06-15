package xadrez;

import pecasDeXadrez.Rei;
import pecasDeXadrez.Torre;
import tabulheiro.Board;
import tabulheiro.Peca;
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
	
	private void alocaNovaPeca(char coluna , int linha,Peca peca) {
		board.colocarPecaTabulheiro(peca, new XadrezPosition(coluna,linha).toPosition());	
	}
	
	private void inicioPartida() {
		alocaNovaPeca('a', 8,new Torre(board, Color.BLACK));
		alocaNovaPeca('h', 8,new Torre(board, Color.BLACK));
		
		alocaNovaPeca('e', 8,new Rei(board, Color.BLACK));
		alocaNovaPeca('e', 1,new Rei(board, Color.BLACK));
		
		
		alocaNovaPeca('a', 1,new Torre(board, Color.WHITE));
		alocaNovaPeca('h', 1,new Torre(board, Color.WHITE));
	}
}
