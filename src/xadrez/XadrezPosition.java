package xadrez;

import tabulheiro.Posicao;

public class XadrezPosition {
	private char coluna;
	private int linha;
	
	public XadrezPosition(char c,int l) {
		if(c <'a' || c > 'h' || l < 1 || l > 8) {
			throw new XadrezExeception("Erro ao criar Posição");			
		}
		this.coluna = c;
		this.linha  = l;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}
	
	protected Posicao toPosition() {
		return new Posicao(8 - linha , coluna - 'a');
	}
	
	protected static XadrezPosition fromPosition(Posicao posi) {
		return new XadrezPosition((char)('a' - posi.getColuna()), 8 - posi.getLinha());
	}
	
	@Override
	public String toString() {
		return "" + coluna + linha;
	}
}
