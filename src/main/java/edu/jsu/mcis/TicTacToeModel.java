package edu.jsu.mcis;

public class TicTacToeModel {
	public enum Mark { EMPTY, X, O };
	private Mark[][] board;
	private boolean xTurn;
	public enum gameStatus { XWIN, OWIN, DRAW, CONTINUE};
	public static gameStatus Status;
	public int moveCounter;
	
	
	public TicTacToeModel() {
		
		board = new Mark[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = Mark.EMPTY;
			}
		}
		moveCounter = 0;
		xTurn = true;
		Status = gameStatus.CONTINUE;
	};
	
	public Mark getMark(int row, int col) {
		return board[row][col];
	}
	
	public void setMark(int row, int col) {
		Mark m = Mark.EMPTY;
		if(board[row][col] == Mark.EMPTY) {
			if(xTurn)
			{	
				m = Mark.X;
				board[row][col] = m;
				
			}
			else
			{
				m = Mark.O;
				board[row][col] = m;
			}
			xTurn = !xTurn;
			moveCounter++;
			WinLoseDraw(row,col,m);
		}
	}
	
	public static gameStatus getStatus() {
		return Status;
	}
	
	public void WinLoseDraw(int row, int col, Mark m) {
		for(int i = 0; i < board.length; i++)
			{
				if(board[row][i] != m)
					break;
					if(i == board.length - 1)
					{
						if(m == Mark.X)
						{
							Status = gameStatus.XWIN;
						}
						else
						{
							Status = gameStatus.OWIN;
						}
				}
			}
			
			for(int i = 0; i < board[row].length; i++)
			{
				if(board[i][col] != m)
					break;
				if(i == board[row].length - 1)
				{
					if(m == Mark.X)
					{
						Status = gameStatus.XWIN;
					}
					else 
					{
						Status = gameStatus.OWIN;
					}
				}
			}
			if(row == col)
			{
				for(int i = 0; i < board.length; i++)
				{
					if(board[i][i] != m)
						break;
					if(i == board.length - 1)
					{
						if(m == Mark.X)
					{
						Status = gameStatus.XWIN;
					}
					else 
					{
						Status = gameStatus.OWIN;
					}
					}
				}
				
				for(int i = 0; i < board.length; i++)
				{
					if(board[i][(board.length - 1) - i] != m)
						break;
					if(i == board.length - 1){
						if(m == Mark.X)
					{
						Status = gameStatus.XWIN;
					}
					else 
					{
						Status = gameStatus.OWIN;
					}
					}
				}
			}
		if(moveCounter == (board.length * board.length))
			Status = gameStatus.DRAW;
	}
	
	public static void main(String[] args) {
		GameBoard frame = new GameBoard();
	}
	
}
