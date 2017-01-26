package edu.jsu.mcis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameBoard extends JFrame {
	private JButton[][] buttons;
	
	TicTacToeModel model = new TicTacToeModel();
	
	private JFrame mainBoard = new JFrame("Tic Tac Toe");
	
	public GameBoard()
	{
		buttons = new JButton[3][3];
		buildGameBoard();
	}
	
	public static void main(String[] args)
	{
		GameBoard board = new GameBoard();
	}
	
	private void buildGameBoard()
	{
		mainBoard.setSize(300,300);
		mainBoard.setLayout(new GridLayout(3,3));
		mainBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int row = 0; row < 3; row++)
		{
			for(int col = 0; col < 3; col++)
			{
				buttons[row][col] = new JButton();
				buttons[row][col].setName("Location" + row + col);
				buttons[row][col].addActionListener(new ButtonListener(row,col));
				buttons[row][col].setFont(new Font("", Font.PLAIN, 72));
				mainBoard.add(buttons[row][col]);
			}
		}
		mainBoard.setVisible(true);
	}
	
	private class ButtonListener implements ActionListener 
	{
		private int row;
		private int col;
		
		public ButtonListener(int r, int c)
		{
			row = r;
			col = c;
		}
		
		public void actionPerformed(ActionEvent e)
		{
			buttonPress(row, col);
		}
	}
	
	public void buttonPress(int row, int col)
	{
		JOptionPane optionPane = new JOptionPane();
		
		model.setMark(row, col);
		
		if(model.getMark(row,col) == TicTacToeModel.Mark.X)
		{
			buttons[row][col].setLabel("X");
		}
		else if(model.getMark(row, col) == TicTacToeModel.Mark.O)
		{
			buttons[row][col].setLabel("O");
		}
		
		if(TicTacToeModel.getStatus() == TicTacToeModel.gameStatus.XWIN)
		{
				optionPane.showMessageDialog(optionPane, "X is the winner!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(TicTacToeModel.getStatus() == TicTacToeModel.gameStatus.OWIN)
		{
				optionPane.showMessageDialog(optionPane, "O is the winner!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
		}
		if(TicTacToeModel.getStatus() == TicTacToeModel.gameStatus.DRAW)
		{
				optionPane.showMessageDialog(optionPane, "It's a tie!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}