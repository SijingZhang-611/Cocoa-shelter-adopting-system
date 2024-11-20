/**
 * Interface representing the Model for a Tic Tac Toe game.
 * The Model handles the game logic, ensuring valid moves and determining the game state.
 *
 */
public interface TTTModel {

  /**
   * Makes a move at the specified row and column.
   *
   * @param row The row of the board (0-indexed).
   * @param col The column of the board (0-indexed).
   * @throws IllegalArgumentException if the move is out of bounds or the cell is already occupied.
   * @throws IllegalStateException if the game has already ended.
   */
  void makeMove(int row, int col);

  /**
   * Checks current player in the game.
   *
   * @return The Player who currently play game.
   * Returns EMPTY if the game has ended.
   */
  Player getCurrentPlayer();


  /**
   * Checks for a winner in the game.
   *
   * @return The Player who has won the game, or EMPTY if there is no winner.
   * Returns EMPTY if the game is a draw.
   */
  Player getWinner();

  /**
   * Resets the game to its initial state.
   * initial state: all values in the board are Player.Empty and the current player is Player.X.
   */
  void resetGame();

  /**
   * Checks whether the game has ended.
   *
   * @return true if the game has ended, otherwise false.
   */
  boolean isGameOver();
}

