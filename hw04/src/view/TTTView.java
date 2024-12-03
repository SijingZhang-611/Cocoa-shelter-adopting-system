package view;

import model.Player;

/**
 * The TTTView interface defines methods for displaying the game state and interacting with the user.
 * It abstracts the input/output operations, allowing the Controller to interact with different types of views
 * (e.g., text-based, GUI, mock views for testing) without knowing the implementation details.
 *
 * Design Rationale:
 * - This interface follows the MVC (Model-View-Controller) pattern by decoupling the user interface from the game logic.
 * - It ensures flexibility and testability by allowing different view implementations to adhere to the same contract.
 */
public interface TTTView {

  /**
   * Displays the current state of the board to the user.
   *
   * @param board A 2D array of {@link Player} representing the current board state.
   *              Each element can be Player.X, Player.O, or Player.EMPTY.
   *
   * Design Rationale:
   * - The board is passed as a 2D array of `Player` to allow the view to render it appropriately.
   * - This method abstracts how the board is displayed, making it adaptable to different view types (text-based or GUI).
   */
  void displayBoard(Player[][] board);

  /**
   * Prompts the user to enter their next move and returns it as a pair of coordinates.
   *
   * @return An array of two integers, where the first element is the row index and the second is the column index.
   *
   * Design Rationale:
   * - The method returns an integer array to represent the user's move (row and column), keeping it simple and easy for the controller to process.
   * - This design ensures the Controller can remain view-agnostic, simply receiving the move coordinates.
   *
   * Potential Improvements:
   * - Consider input validation within the Controller to ensure the returned move is valid.
   */
  int[] getUserMove();

  /**
   * Displays a message to the user.
   *
   * @param message The message to be displayed.
   *
   * Design Rationale:
   * - This method allows the Controller to send feedback or game updates to the user without concern for the presentation.
   * - Keeping this separate from other methods promotes single responsibility and makes it easier to customize messages.
   */
  void showMessage(String message);

  /**
   * Displays the game result, indicating the winner or if the game is a draw.
   *
   * @param winner The {@link Player} who won the game, or Player.EMPTY if it was a draw.
   *
   * Design Rationale:
   * - Passing the winner as a `Player` enum simplifies logic in both the Controller and View.
   * - The method abstracts how the result is presented, making it adaptable to various output formats (text, graphical).
   * - It ensures the View handles different outcomes (win, lose, draw) uniformly.
   */
  void showGameResult(Player winner);
}