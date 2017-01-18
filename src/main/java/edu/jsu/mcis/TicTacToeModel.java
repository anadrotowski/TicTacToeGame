package edu.jsu.mcis;

public class TicTacToeModel {
	public enum Mark { EMPTY, X, O };
	private Mark[][] board;
	private boolean xTurn;
	
	public TicTacToeModel() {
		board = new Mark[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = Mark.EMPTY;
			}
		}
		xTurn = true;
	}
	
	public Mark getMark(int row, int col) {
		return board[row][col];
	}
	
	public void setMark(int row, int col) {
		Mark m = (xTurn)? Mark.X : Mark.O;
		if(board[row][col] = Mark.EMPTY) {
			board[row][col] = m;
			xTurn = !xTurn;
		}
		
	}