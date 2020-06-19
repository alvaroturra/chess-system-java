package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		// User Interface importar a classe UI
		UI.printBoard(chessMatch.getPieces());
		
		
		
		
	}

}
