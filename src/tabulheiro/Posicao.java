package tabulheiro;

public class Posicao {
	private int linha;
	private int coluna;

	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public void setValores(int L, int C) {
		linha  = L;
		coluna = C;
	}
}
