package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Board class.
 */
public class BoardTest {

    @Test
    public void testBoardWith1x1Grid() {
        // Create a 1x1 grid with a BasicSquare
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();

        // Create the board
        Board board = new Board(grid);

        // Check if the board has the correct dimensions
        assertEquals(1, board.getWidth());
        assertEquals(1, board.getHeight());

        // Check if the square at (0, 0) is not null
        assertNotNull(board.squareAt(0, 0));
    }
    @Test
    public void testBoardWithNullSquare() {
        // Create a 1x1 grid with a null square
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;

        // Exception expected due to invariant check (null square)
        assertThrows(AssertionError.class, () -> {
            new Board(grid);
        });
    }
}
