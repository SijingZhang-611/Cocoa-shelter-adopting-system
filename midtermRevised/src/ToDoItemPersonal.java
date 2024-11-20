import java.util.List;

/**
 * School items are like other ToDos, but need prepTime, a double
 * <p></p>
 * This requires overriding the toString method
 */
//error1: ToDoItemAbs is a class, so ToDoItemPersonal need extends ToDoItemAbs.
  //how to fix: change implements to extends
 public class ToDoItemPersonal extends ToDoItemAbs {
   //error4: description/importance/urgency has been defined in its parent class ToDoItemAbs.
  //how to fix: No need to define again. delete description/importance/urgency
  //public String description;
  //private Importance importance;
  //private int urgency;
  private final double prepTime;

  public ToDoItemPersonal(String description, Importance importance,
      int urgency, double prepTime ) {
    //error2: Super method parameter type does not match.
    //how to fix: need to switch the input attributes position.
    super(description, importance, urgency);
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
  //error5: equals method is from Object class not ToDoItemPersonal class.
  // how to fix: The input attribute need to update and also the code inside the method.
  public boolean equals(Object obj) {
    if (this == obj) return true;
    // Null object or incompatible class type causes incorrect behavior.
    // how to fix: check null and class type comparison.
    if (obj == null || getClass() != obj.getClass()) return false;
    // if object type is not validated,cast might fail.
    // how to fix:Ensure type compatibility before casting.
    ToDoItemPersonal itm = (ToDoItemPersonal) obj;
    return this.getDescription().equals(itm.getDescription()) &&
        this.getUrgency() == itm.getUrgency() &&
        this.getImportance() == itm.getImportance() &&
        Double.compare(this.getPrepTime(), itm.getPrepTime()) == 0;
  }

  @Override
  public String toString() {
    String str = "ToDoItem: "+this.getDescription();
    str += " Importance: "+this.getImportance()+" Urgency: "+this.getUrgency();
    str += " PrepTime: "+this.getPrepTime();
    //error3: missing return string.
    //how to fix: add return.
    return str;
  }
}
