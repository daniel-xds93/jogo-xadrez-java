package application;

import chess.ChessPiece;

public class UI {
	public static void printBoard(ChessPiece[][] pieces) {
		for(int i = 0; i < pieces.length; i++) {
			// a linha abaixo é para mostrar o numero da linha
			System.out.print((8 - i) + " ");
			for(int j = 0; j <pieces.length; j++) {
				// a linha abaixo é para imprimir a peça
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		// a linha abaixo é para aparecer as letras das colunas abaixo
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print("-");
		}else {
			System.out.print(piece);
		}
		
		System.out.print(" ");
	}
}
