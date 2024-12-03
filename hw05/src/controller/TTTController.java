package controller;

import model.Player;
import model.TTTModel;
import view.TTTView;

/**
 * The TTTController class handles user input, updates the model, and updates the view.
 */
public class TTTController {
  private final TTTModel model;
  private final TTTView view;

  public TTTController(TTTModel model, TTTView view) {
    this.model = model;
    this.view = view;
  }

  public void playGame() {
    view.showMessage("Welcome to Tic Tac Toe!");
    while (!model.isGameOver()) {
      view.displayBoard(model.getBoard());
      int[] move = view.getUserMove();
      try {
        model.makeMove(move[0], move[1]);
      } catch (IllegalArgumentException e) {
        view.showMessage("Invalid move: " + e.getMessage());
      }
    }
    view.displayBoard(model.getBoard());
    view.showGameResult(model.getWinner());
  }
}