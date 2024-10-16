import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListOfIntsTest {

  // Test prepend method
  @Test
  public void testPrependToEmptyList() {
    ListOfInts list = new EmptyNode();
    list = list.prepend(5);
    assertEquals(5, list.getDataAtIndex(0), "Prepending to an empty list failed.");
  }

  @Test
  public void testPrependToNonEmptyList() {
    ListOfInts list = new EmptyNode().prepend(5).prepend(10);
    assertEquals(10, list.getDataAtIndex(0), "Prepending to non-empty list failed.");
    assertEquals(5, list.getDataAtIndex(1), "Second element after prepend is incorrect.");
  }

  // Test append method
  @Test
  public void testAppendToEmptyList() {
    ListOfInts list = new EmptyNode();
    list = list.append(10);
    assertEquals(10, list.getDataAtIndex(0), "Appending to an empty list failed.");
  }

  @Test
  public void testAppendToNonEmptyList() {
    ListOfInts list = new EmptyNode().prepend(5);
    list = list.append(20);
    assertEquals(5, list.getDataAtIndex(0), "First element after append is incorrect.");
    assertEquals(20, list.getDataAtIndex(1), "Appending to a non-empty list failed.");
  }

  // Test insertAtIndex method
  @Test
  public void testInsertAtIndexInMiddle() {
    ListOfInts list = new EmptyNode().prepend(5).append(15);
    list = list.insertAtIndex(10, 1);
    assertEquals(10, list.getDataAtIndex(1), "Inserting at middle index failed.");
    assertEquals(15, list.getDataAtIndex(2), "List order incorrect after insert.");
  }

  @Test
  public void testInsertAtIndexInEmptyList() {
    ListOfInts list = new EmptyNode();
    list = list.insertAtIndex(7, 0);
    assertEquals(7, list.getDataAtIndex(0), "Inserting in an empty list failed.");
  }

  @Test
  public void testInsertAtInvalidIndex() {
    ListOfInts list = new EmptyNode().prepend(5);
    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.insertAtIndex(10, 5);
    }, "Expected IndexOutOfBoundsException when inserting at invalid index.");
  }

  // Test getDataAtIndex method
  @Test
  public void testGetDataAtIndexValid() {
    ListOfInts list = new EmptyNode().prepend(5).append(10).append(15);
    assertEquals(10, list.getDataAtIndex(1), "getDataAtIndex returned incorrect value.");
  }

  @Test
  public void testGetDataAtIndexInvalid() {
    ListOfInts list = new EmptyNode().prepend(5);
    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.getDataAtIndex(5);
    }, "Expected IndexOutOfBoundsException for invalid index.");
  }

  // Test getRest method
  @Test
  public void testGetRestFromNonEmptyList() {
    ListOfInts list = new EmptyNode().prepend(5).append(10).append(15);
    ListOfInts rest = list.getRest();
    assertEquals(10, rest.getDataAtIndex(0), "getRest did not return the correct first element.");
    assertEquals(15, rest.getDataAtIndex(1), "getRest did not return the correct second element.");
  }

  @Test
  public void testGetRestFromSingleElementList() {
    ListOfInts list = new EmptyNode().prepend(5);
    assertThrows(UnsupportedOperationException.class, () -> {
      list.getRest();
    }, "Expected UnsupportedOperationException when calling getRest on single-element list.");
  }

  // Test getCountClassic method
  @Test
  public void testGetCountClassicWithMultipleElements() {
    ListOfInts list = new EmptyNode().prepend(5).append(10).append(15);
    assertEquals(3, list.getCountClassic(), "getCountClassic returned incorrect count.");
  }

  @Test
  public void testGetCountClassicWithEmptyList() {
    ListOfInts list = new EmptyNode();
    assertEquals(0, list.getCountClassic(), "getCountClassic should return 0 for empty list.");
  }

  // Test getCountWithHelper method
  @Test
  public void testGetCountWithHelperMultipleElements() {
    ListOfInts list = new EmptyNode().prepend(5).append(10).append(15);
    assertEquals(3, list.getCountWithHelper(), "getCountWithHelper returned incorrect count.");
  }

  @Test
  public void testGetCountWithHelperEmptyList() {
    ListOfInts list = new EmptyNode();
    assertEquals(0, list.getCountWithHelper(), "getCountWithHelper should return 0 for empty list.");
  }

  // Test getSum method
  @Test
  public void testGetSumMultipleElements() {
    ListOfInts list = new EmptyNode().prepend(5).append(10).append(15);
    assertEquals(30, list.getSum(), "getSum returned incorrect sum.");
  }

  @Test
  public void testGetSumEmptyList() {
    ListOfInts list = new EmptyNode();
    assertEquals(0, list.getSum(), "getSum should return 0 for empty list.");
  }
}
