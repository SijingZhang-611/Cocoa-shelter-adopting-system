public class EmptyNode implements ListOfInts {
  /**
   * Represents an empty node in the list.
   */
  @Override
  public ListOfInts prepend(int data) {
    return new ElementNode(data, this);
  }

  @Override
  public ListOfInts append(int data) {
    return new ElementNode(data, this);
  }

  @Override
  public ListOfInts insertAtIndex(int data, int index) {
    if (index == 0) {
      return new ElementNode(data, this);
    }
    throw new IndexOutOfBoundsException("Index out of bounds");
  }

  @Override
  public int getDataAtIndex(int index) {
    throw new IndexOutOfBoundsException("Index out of bounds");
  }

  @Override
  public ListOfInts getRest() {
    throw new UnsupportedOperationException("Empty node has no rest");
  }

  @Override
  public int getCountClassic() {
    return 0;
  }

  @Override
  public int getCountWithHelper() {
    return getCountHelper(0);
  }

  @Override
  public int getCountHelper(int acc) {
    return acc;
  }

  @Override
  public int getSum() {
    return 0;
  }

  @Override
  public String toString() {
    return "[]";
  }
}
