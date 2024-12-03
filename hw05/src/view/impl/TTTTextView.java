package view.impl;

import model.Player;
import java.util.Scanner;
import view.TTTView;

public class TTTTextView implements TTTView {
  private final Scanner scanner = new Scanner(System.in);

  @Override
  public void displayBoard(Player[][] board) {
    for (Player[] row : board) {
      for (Player cell : row) {
        System.out.print(cell == Player.EMPTY ? "-" : cell);
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  @Override
  public int[] getUserMove() {
    System.out.println("Enter your move (row and column): ");
    int row = scanner.nextInt();
    int col = scanner.nextInt();
    return new int[]{row, col};
  }

  @Override
  public void showMessage(String message) {
    System.out.println(message);
  }

  @Override
  public void showGameResult(Player winner) {
    if (winner == Player.EMPTY) {
      System.out.println("It's a draw!");
    } else {
      System.out.println("Player " + winner + " wins!");
    }
  }
}
