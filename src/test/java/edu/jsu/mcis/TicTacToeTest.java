package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
	@Test
	public void testInitialBoardIsEmpty() {
		TicTacToeModel model = new TicTacToeModel ();
		for(int row = 0; row <3; row++) {
			for(int col = 0; col < 3; col++){
				Mark m = model.getMark(row, col);
				assertEquals(TicTacToeModel.Mark.EMPTY, m);
			}
		}
		
		assertTrue(false);
	}
	
	@Test
	public void testMarkXInUpperRightCorner() {
		TicTacToeModel model = new TicTacToeModel();
		model.setMark(0,2);
		TicTacToeModel.Mark m = model.getMark(0,2);
		assertEquals(TicTacToeModel.Mark.X, m);
		
		assertTrue(false);
	}
	
	@Test
	public void testMarkOInBottomLeftCorner() {
		TicTacToeModel model = new TicTacToeModel();
		model.setMark(2, 2);
		TicTacToeModel.Mark m = model.getMark(2,2);
		assertEquals(TicTacToeModel.Mark.O, m);
		
		assertTrue(false);
	}
	
	@Test
	public void testUnableToMarkOverExistingMark() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsNotOverAfterTheFirstMark() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsWonByXHorizontallyAcrossTopRow() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsOverByTieIfAllLocationsAreFilled() {
		assertTrue(false);
	}	
}
