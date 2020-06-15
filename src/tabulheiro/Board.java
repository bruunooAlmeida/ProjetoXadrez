package tabulheiro;

public class Board {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Board(int L, int C) {
		if(L < 1 || C < 1) {
			throw  new BoardException("Erro ao criar Tabulheiro");
		}
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
		if(!PosicaoExiste(linha, coluna)) {
			throw new BoardException("Posição não existe");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPecaTabulheiro(Peca peca,Posicao posicao) {
		if(haUmaPeca(posicao)) {
			throw new BoardException("Já existe uma Peça nessa Posição" + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean PosicaoExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas  && coluna >= 0  && coluna < colunas;
	}
	
	public boolean isPosicaoExiste(Posicao posicao) {
		return PosicaoExiste(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean haUmaPeca(Posicao posicao) {
		if(!isPosicaoExiste(posicao)) {
			throw new BoardException("Posição Não existe no Tabulheiro");
		}
		return peca(posicao) != null;
	}

}
