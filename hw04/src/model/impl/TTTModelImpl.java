package model;

/**
 * The TTTModel class represents the state of a Tic Tac Toe game and provides methods to manipulate it.
 */
public class TTTModelImpl implements TTTModel {
  private Player[][] board;
  private Player currentPlayer;
  private boolean gameOver;

  public TTTModelImpl() {
    resetGame();
  }

  public void makeMove(int row, int col) {
    if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != Player.EMPTY || gameOver) {
      throw new IllegalArgumentException("Invalid move.");
    }
    board[row][col] = currentPlayer;
    checkWinner();
    currentPlayer = (currentPlayer == Player.X) ? Player.O : Player.X;
  }

  public Player getCurrentPlayer() {
    return currentPlayer;
  }

  public Player getWinner() {
    return checkWinner();
  }

  public boolean isGameOver() {
    return gameOver;
  }

  public void resetGame() {
    board = new Player[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = Player.EMPTY;
      }
    }
    currentPlayer = Player.X;
    gameOver = false;
  }

  public Player[][] getBoard() {
    return board;
  }

  private Player checkWinner() {
    // Check rows, columns, and diagonals.
    for (int i = 0; i < 3; i++) {
      if (board[i][0] != Player.EMPTY && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
        gameOver = true;
        return board[i][0];
      }
      if (board[0][i] != Player.EMPTY && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
        gameOver = true;
        return board[0][i];
      }
    }
    if (board[0][0] != Player.EMPTY && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
      gameOver = true;
      return board[0][0];
    }
    if (board[0][2] != Player.EMPTY && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
      gameOver = true;
      return board[0][2];
    }
    // Check for draw.
    for (Player[] row : board) {
      for (Player cell : row) {
        if (cell == Player.EMPTY) {
          return Player.EMPTY;
        }
      }
    }
    gameOver = true;
    return Player.EMPTY;
  }
}