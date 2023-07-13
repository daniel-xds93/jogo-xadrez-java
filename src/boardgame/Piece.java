package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null; // caso não seja atribuido o valor null a position o java ja inicia como null
	}
	
	protected Board getBoard() {
		return board;
	}
	

}
