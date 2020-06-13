package tabulheiro;

public class Board {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Board(int L, int C) {
		this.colunas = C;
		this.linhas  = L;
		pecas = new Peca[L][C];
	}
	
	public int getLinhas() {
		return linhas;
	}
	
	public int getColunas() {
		return colunas;
	}
	
	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
}
