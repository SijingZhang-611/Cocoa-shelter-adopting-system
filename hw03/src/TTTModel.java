/**
 * Interface representing the Model for a Tic Tac Toe game.
 * The Model handles the game logic, ensuring valid moves and determining the game state.
 * Illegal moves are handled through exceptions.
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

  /*
   * Design Decision: Throws exceptions for invalid states (like out-of-bounds or
   *   making a move after the game ends) to ensure the Controller can handle errors effectively.
   *   We chose exceptions instead of returning a boolean to avoid silent failures.
   * Rationale: Encourages fail-fast behavior and provides useful error feedback.
   */
  void makeMove(int row, int col);

  /**
   * Checks current player in the game.
   *
   * @return The Player who currently play game.
   * Returns EMPTY if the game has ended.
   */

  /*
   * Design Decision: Provides the current player directly, instead of requiring external tracking
   *   in the Controller.
   * Rationale: Simplifies game management by allowing the Controller to query this directly.
   * @return the Player (X or O) who is next to play.
   */
  Player getCurrentPlayer();

  /**
   * Checks for a winner in the game.
   *
   * @return The Player who has won the game, or EMPTY if there is no winner.
   * Returns EMPTY if the game is a draw.
   */

  /*
   * Design Decision: Provides the current winner.
   * Rationale: Simplifies game management by allowing the Controller to query this directly.
   */
  Player getWinner();


  /**
   * Resets the game to its initial state.
   */

  /**
   *
   * Design Decision :initial state: all values in the board are Player.Empty and the current player is Player.X.
   * should be called to start a new game
   */

  void resetGame();

  /**
   * Checks whether the game has ended.
   *
   * @return true if the game has ended, otherwise false.
   */

  /**
   *
   * Design Decision :Checks whether the game has ended.
   * can be called at any time.
   */
  boolean isGameOver();
}

