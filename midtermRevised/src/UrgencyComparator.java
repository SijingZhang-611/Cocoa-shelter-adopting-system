import java.util.Comparator;

/**
 *  A comparator for comparing two ToDoItem objects based on their urgency levels.
 *  Higher urgency values are considered greater.
 */
public class UrgencyComparator implements Comparator<ToDoItem> {

  /**
   * A comparator for comparing two ToDoItem objects based on their urgency levels.
   * @param itm1 the first object to be compared.
   * @param itm2 the second object to be compared.
   * @return 0 if two items is equal,1 first item bigger than second item.-1 first item smaller than second item
   */
  @Override
  public int compare(ToDoItem itm1, ToDoItem itm2) {
    // STUDENT TO IMPLEMENT THIS METHOD
    int itm1_urgency=itm1.getUrgency();
    int itm2_urgency=itm2.getUrgency();
    if (itm1_urgency>itm2_urgency){
      return 1;
    }else if (itm1_urgency<itm2_urgency){
      return -1;
    }
    return 0;
  }
}
