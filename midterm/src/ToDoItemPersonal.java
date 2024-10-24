import java.util.List;

/**
 * School items are like other ToDos, but need prepTime, a double
 * <p></p>
 * This requires overriding the toString method
 */

 public class ToDoItemPersonal implements ToDoItemAbs {
  private String description;
  // This should be private.because we can set the description in the method.

  private Importance importance;
  private int urgency;
  private final double prepTime;

  public ToDoItemPersonal(String description, Importance importance,
      int urgency, double prepTime ) {
    super(description, urgency, importance);
    this.prepTime = prepTime;
  }

  /**
   * School items need estimated time needed to prepare
   *
   * @return prepTime -- a double -- in minutes
   */
  public double getPrepTime() {
    return this.prepTime;
  }

  @Override
  public boolean equals(ToDoItemPersonal itm) {
    if (this == itm) return true;
    return this.getDescription().equals(itm.getDescription()) &&
        (this.getUrgency() == itm.getUrgency()) &&
        (this.getImportance() == itm.getImportance()) &&
        (this.getPrepTime() == itm.getPrepTime());

  }

  @Override
  public String toString() {
    String str = "ToDoItem: "+this.getDescription();
    str += " Importance: "+this.getImportance()+" Urgency: "+this.getUrgency();
    str += " PrepTime: "+this.getPrepTime();
  }
}
