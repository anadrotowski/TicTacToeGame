import edu.jsu.mcis.*;


public class TicTacToeKeywords {
	private TicTacToeModel model;

	public void startNewGame() {
		model = new TicTacToeModel();
	}
	
	public void MarkLocation(int row, int col) {
		System.out.println(row + " " + col);
		model.setMark(row, col);
	}
	
	public String getMark(int row, int col) {
		TicTacToeModel.Mark m = model.getMark(row,col);
		if(m == TicTacToeModel.Mark.X) return "X";
		else if(m == TicTacToeModel.Mark.O) return "O";
		else return "";
	}
    
	public String getWinner() {
		TicTacToeModel.gameStatus Status = TicTacToeModel.getStatus();
		if(Status == TicTacToeModel.gameStatus.XWIN) return "X";
		else if(Status == TicTacToeModel.gameStatus.OWIN) return "O";
		else if(Status == TicTacToeModel.gameStatus.DRAW) return "TIE";
		else return "";
	}
}
