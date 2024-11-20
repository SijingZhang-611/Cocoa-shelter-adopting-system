/**
 * An abstract class representing a generic ToDoItem
 * This class provides a base implementation for all to-do items
 */

public abstract class ToDoItemAbs implements ToDoItem, Comparable<ToDoItem> {

  /**
   * Description of to-do item.
   */
  protected String description;
  /**
   * An integer representing the urgency of the to-do item.
   */
  protected int urgency;
  /**
   * The importance level of the to-do item, represented as an enum.
   */
  protected Importance importance;

  /**
   * Javadocs in progress STUDENT TO COMPLETE THIS ONE
   * Constructs a new ToDoItem with the given description, importance, and urgency.
   *
   * @param description a brief description of the to-do item.
   * @param importance  the importance of the to-do item.
   * @param urgency     the urgency of the to-do item.
   */
  public ToDoItemAbs(String description,
      Importance importance,
      int urgency) {
    this.description = description;
    this.importance = importance;
    this.urgency = urgency;
  }

  /**
   * Javadocs in progress STUDENT TO IMPLEMENT THIS ONE
   * Return the description of this item.
   * @return a string description of the task
   */
  public String getDescription() {
    return this.description;
    }

  /**
   * Returns the importance of this item
   * <p></p>
   *
   * @return Importance (an enum: LOW, MEDIUM, or HIGH)
   */
  @Override
  public Importance getImportance() {
    return this.importance;
  }

  /**
   * return the urgency of this task
   * @return urgency of this item as an int
   */
  @Override
  public int getUrgency() {
    return this.urgency;
  }

  /**
   * Set the urgency of this item.
   *
   * @param urgency
   */
  public void setUrgency(int urgency) {
    this.urgency = urgency;
  }

  /**
   * Comparable Interface for sorting by importance
   * @param other -- a ToDoItem
   * @return negative, 0, or positive int for LOW, MEDIUM, or HIGH
   */
  @Override
  public int compareTo(ToDoItem other) {
    // STUDENT TO IMPLEMENT THIS METHOD
    if (this.importance == null || other.getImportance() == null) {
      throw new NullPointerException("Cannot compare to a null object");
    }
    return this.importance.compareTo(other.getImportance());
    }
}
