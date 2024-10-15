public class ElementNode implements ListOfInts {
  private int data;
  private ListOfInts next;

  public ElementNode(int data, ListOfInts next) {
    this.data = data;
    this.next = next;

  }

  @Override
  public ListOfInts prepend(int data) {
    return new ElementNode(data, this);
  }

  @Override
  public ListOfInts append(int data) {
    return new ElementNode(this.data, next.append(data));
  }

  @Override
  public ListOfInts insertAtIndex(int data, int index) {
    if (index == 0) {
      return prepend(data);
    } else {
      return new ElementNode(this.data, next.insertAtIndex(data, index - 1));
    }
  }

  @Override
  public int getDataAtIndex(int index) {
    if (index == 0) {
      return this.data;
    } else {
      return next.getDataAtIndex(index - 1);
    }
  }

  @Override
  public ListOfInts getRest() {
    return this.next;
  }

  @Override
  public int getCountClassic() {
    return 1 + next.getCountClassic();
  }

  @Override
  public int getCountWithHelper() {
    return getCountHelper(0);
  }

  @Override
  public int getCountHelper(int acc) {
    return next.getCountHelper(acc + 1);
  }

  @Override
  public int getSum() {
    return this.data + next.getSum();
  }

  @Override
  public String toString() {
    return this.data + " -> " + next.toString();
  }
}
