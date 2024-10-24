public abstract class ToDoItemAbs implements ToDoItem, Comparable<ToDoItem> {
  protected String description;
  protected int urgency;
  protected Importance importance;

  /**
   * Javadocs in progress STUDENT TO COMPLETE THIS ONE
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
   */
  public String getDescription() {
    return this.description;
    }

  /**
   * Returns the importance of this item
   * <p></p>
   * @return Importance (an enum: LOW, MEDIUM, or HIGH)
   */
  @Override
  public Importance getImportance() {
    return this.importance;
  }

  /**
   * Javadocs in progress
   * @return urgency of this item as an int
   */
  @Override
  public int getUrgency() {
    return this.urgency;
  }

  /**
   * Javadocs in progress
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
    if ((other.getUrgency() == this.getUrgency()
        && other.getImportance() == this.getImportance())
        && other.getDescription() == this.getDescription()){
        System.out.println("This two objects are equal.");
    }
    return 0;
  }

