/**
 * A concrete implementation of the TTTModel interface.
 */
public class impl_TTT implements TTTModel{

  /**
   * The game board represented as a 2D array of Player values.
   * Each cell can hold a Player X, O or be empty.
   * Internal representation, not exposed outside this class.
   */
  private Player[][] board;

  /**
   * The player whose turn it is to make a move.
   */
  private Player currentPlayer;

  /**
   * Tracks whether the game has ended.
   */
  private boolean gameOver;

  //Constructs a new game instance and sets the game to its initial state.
  public impl_TTT() {
    resetGame();
  }

  @Override
  public void makeMove(int row, int col) {
    // Ensure the game is not over before proceeding.
    // if the move is not legal,throw different Exception based on the illegal reason.
    if (gameOver) {
      throw new IllegalStateException("The game has already ended.");
    }
    // Validate row and column indices (0-based).
    if (row < 0 || row >= 3 || col < 0 || col >= 3) {
      throw new IllegalArgumentException("Move is out of bounds.");
    }
    // Ensure the target cell is unoccupied.
    if (board[row][col] == Player.X || board[row][col] == Player.O) {
      throw new IllegalArgumentException("Cell is already occupied.");
    }
    // If all validations pass, update the board with the current player's move.
    board[row][col] = currentPlayer;
    //check whether the game is over,if not, change the turn to next player.
    if (hasWon(currentPlayer)) {
      gameOver = true;
    } else if (isBoardFull()) {
      gameOver = true;
    } else {
      // If the game is not over, switch to the next player.
      currentPlayer = currentPlayer.getNextPlayer();
    }
  }

  @Override
  public Player getCurrentPlayer() {
    //// Throw an exception if the game is already over.
    if (gameOver){
      throw new IllegalStateException("The game is over. So we don't have a current player.");
      }
    //// Return the current player.
      return currentPlayer;
  }

  @Override
  public Player getWinner() {
    //Ensure the game is over before determining the winner.
    if (!gameOver) {
      throw new IllegalStateException("The game is not over. So we don't have a winner currently.");
    }
    // Check for a winner or return Player.Empty for a draw.
    for (Player player : Player.values()) {
      if (player!=Player.Empty && hasWon(player)) {
        return player; // Return the winning player.
      }
    }
    return Player.Empty; // If no winner, return Player.Empty to indicate a draw.
  }

  @Override
  public void resetGame() {
    //Set 2D array representing a game board. Initialize the board to be entirely empty.
    board = new Player[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = Player.Empty;
      }
      // Set Player.X as the initial player.
      currentPlayer = Player.X;
      //set gameOver flag as false.
      gameOver = false;
    }
  }

  @Override
  public boolean isGameOver() {
    return gameOver;
  }

  /**
   * Checks if the specified player has won the game.
   * A player wins by filling an entire row, column, or diagonal.
   *
   * @param player The player to check for a win condition.
   * @return true if the player has won, otherwise false.
   */
  private boolean hasWon(Player player) {
    // Check rows, columns
    for (int i = 0; i < 3; i++) {
      if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
          (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
        return true;
      }
    }
    //check diagonals
    if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
      return true;
    }
    if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
      return true;
    }
    return false;
  }

  private boolean isBoardFull() {
    //check whether the board has full.
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (board[i][j] == Player.Empty) {
          return false;
        }
      }
    }
    return true;
  }
}