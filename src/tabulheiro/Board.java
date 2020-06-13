package tabulheiro;

public class Board {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Board(int L, int C) {
		this.colunas = C;
		this.linhas  = L;
	}
	
	public int getLinhas() {
		return linhas;
	}
}
