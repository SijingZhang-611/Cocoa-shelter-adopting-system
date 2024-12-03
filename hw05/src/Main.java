import controller.TTTController;
import model.TTTModel;
import model.TTTModelImpl;
import view.TTTView;
import view.impl.TTTTextView;

public class Main {
  public static void main(String[] args) {
    // Initialize the components
    TTTModel model = new TTTModelImpl();
    TTTView view = new TTTTextView();
    TTTController controller = new TTTController(model, view);

    // Start the game
    controller.playGame();
  }
}