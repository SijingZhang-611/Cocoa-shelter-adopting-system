package model;

/**
 * Enum representing the players in a Tic Tac Toe game.
 * Players are possible: X , O and Empty.
 */

public enum Player {

    X, O, EMPTY;

    /**
     * Gets the other player.
     * @return the opponent of the current player.
     */
    public Player getNextPlayer() {
      if (this.equals(X)) {
        return O;
      }else if (this.equals(O)) {
        return X;
      }
        return EMPTY;
    }
  }

