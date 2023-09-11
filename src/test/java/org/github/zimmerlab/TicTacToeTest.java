package org.github.zimmerlab;

import org.github.zimmerlab.basicpackage.BasicBoard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class TicTacToeTest {

	@Test
	@DisplayName("class implements Game.class interface")
	public void implementsInterfaceGame() {

		List<Class<?>> interfaces = Arrays.asList(TicTacToe.class.getInterfaces());

		Assertions.assertEquals(1, interfaces.size());
		Assertions.assertTrue(interfaces.contains(Game.class));
	}

	@Test
	@DisplayName("class extends BasicBoard.class")
	public void extendsBasicBoard() {
		Assertions.assertTrue(BasicBoard.class.isAssignableFrom(TicTacToe.class));
	}

	@Test
	@DisplayName("Test the gameStatus() method class TicTacToe")
	public void testGameStatus() {
		TicTacToe ticTacToe = new TicTacToe(3);

		Assertions.assertEquals("not implemented", ticTacToe.gameStatus());
	}

}