
public interface ListOfInts {
  /**
   * This interface represents a list of integers and includes methods
   * for adding elements, retrieving elements, and performing various operations
   * like getting the size or sum of the list.
   */

  ListOfInts prepend(int data);
  /**
   * Prepends a new integer to the front of the list.
   *
   * @param data the integer to be added
   * @return a new ListOfInts with the new integer added at the front
   */

  ListOfInts append(int data);
  /**
   * Appends a new integer to the back of the list.
   *
   * @param data the integer to be added
   * @return a new ListOfInts with the new integer added at the back
   */

  ListOfInts insertAtIndex(int data, int index);
  /**
   * Inserts a new integer at the specified index.
   *
   * @param index the position at which to insert the new integer
   * @return a new ListOfInts with the new integer inserted
   * @throws IndexOutOfBoundsException if index is greater than the list size
   */

  int getDataAtIndex(int index);
  /**
   * Returns the integer stored at the specified index.
   *
   * @return the integer at the specified index
   * @throws IndexOutOfBoundsException if index is greater than the list size
   */

  ListOfInts getRest();
  /**
   * Returns the rest of the list excluding the first element.
   *
   * @return a new ListOfInts containing all elements except the first
   */

  int getCountClassic();
  /**
   * Returns the count of elements in the list using classic recursion.
   *
   * @return the number of elements in the list
   */

  int getCountWithHelper();
  /**
   * Returns the count of elements using a helper method.
   *
   * @return the number of elements in the list
   */

  int getCountHelper(int acc);
  /**
   * Helper method to count elements in the list.
   *
   * @return the number of elements in the list
   */

  int getSum();
  /**
   * Calculates the sum of all the elements in the list.
   *
   * @return the sum of the elements
   */
}


