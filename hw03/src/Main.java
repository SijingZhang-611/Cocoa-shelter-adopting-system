/**
 * This class is used to execute the tic-tac-toe game
 */

public class Main {

  public static void main(String[] args) {

    TTTModel model = new impl_TTT(); // Create a new instance of the Tic Tac Toe model.

    model.makeMove(0, 0); // X move one step
    model.makeMove(1, 2); // O move one step
    model.makeMove(0, 1); // X move one step
    model.makeMove(2, 2); // O move one step
    model.makeMove(0, 2); // X move one step

    System.out.println("Winner: " + model.getWinner());
    System.out.println("Game Over: " + model.isGameOver());
  }
  }
