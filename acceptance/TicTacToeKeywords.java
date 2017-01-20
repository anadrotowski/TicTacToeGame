import edu.jsu.mcis.*;

public class TicTacToeKeywords {
	private TicTacToeModel model;
	
	public void startNewGame() {
		TicTacToeModel model = new TicTacToeModel();
	}
	
	public void markLocation(int row, int col) {
		model.setMark(row, col);
	}
	
	public String getMark(int row, int col) {
		TicTacToe.Mark m = t.getMark(row,col);
		if(m == TicTacToe.Mark.X) return "X";
		else if(m == TicTacToe.Mark.O) return "O";
		else return "";
	}
    
	public String getWinner() {
		TicTacToe.gameStatus Status = t.getStatus();
		if(Status == TicTacToe.gameStatus.XWIN) return "X";
		else if(Status == TicTacToe.gameStatus.OWIN) return "O";
		else if(Status == TicTacToe.gameStatus.DRAW) return "TIE";
		else return "";
	}
}
