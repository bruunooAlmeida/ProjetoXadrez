package programa;

import xadrez.PecaXadrez;

public class UI {
	public static void mostraTabulheiro(PecaXadrez[][] pecas) {
		System.out.println("  a b c d e f g h");
		for (int i = 0; i < pecas.length; i++) {
			System.out.printf((8 - i) + " ");
			for (int j = 0; j < pecas.length; j++) {
				imprimirPeca(pecas[i][j]); 
			}
			System.out.printf((8 - i) + " ");
			System.out.printf("\n");			
		}
		System.out.println("  a b c d e f g h");
	}
	
	public static void imprimirPeca(PecaXadrez peca) {
		if(peca == null) {
			System.out.printf("-");
			
		}else {
			System.out.print(peca);
			
		}
		System.out.print(" ");
	}
}
