import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListOfIntsTest {

  @Test
  public void testPrepend() {
    ListOfInts list = new EmptyNode();
    list = list.prepend(10);
    assertEquals(10, list.getDataAtIndex(0));
  }

  @Test
  public void testAppend() {
    ListOfInts list = new EmptyNode();
    list = list.append(20);
    assertEquals(20, list.getDataAtIndex(0));
  }

  @Test
  public void testGetSum() {
    ListOfInts list = new EmptyNode();
    list = list.prepend(10).append(20).prepend(5);
    assertEquals(35, list.getSum());
  }

  @Test
  public void testInsertAtIndex() {
    ListOfInts list = new EmptyNode();
    list = list.append(10).append(20);
    list = list.insertAtIndex(15, 1);
    assertEquals(15, list.getDataAtIndex(1));
  }

  @Test
  public void testGetCountClassic() {
    ListOfInts list = new EmptyNode();
    list = list.prepend(10).append(20).prepend(5);
    assertEquals(3, list.getCountClassic());
  }
}