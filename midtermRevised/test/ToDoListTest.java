import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ToDoListTest {
  private ToDoList toDoList;
  private ToDoItemSchool schoolItem1;
  private ToDoItemSchool schoolItem2;
  private ToDoItemPersonal personalItem;
  @BeforeEach
  void setUp() {
    toDoList = new ToDoList();

    schoolItem1 = new ToDoItemSchool("java homework", Importance.HIGH, 10, true);
    schoolItem2 = new ToDoItemSchool("c language homework", Importance.MEDIUM, 5, false);
    personalItem = new ToDoItemPersonal("go to park", Importance.LOW, 2, 30.0);

    toDoList.addItem(schoolItem1);
    toDoList.addItem(schoolItem2);
    toDoList.addItem(personalItem);
  }

  @Test
  void addItem() {
    ToDoItemPersonal newItem = new ToDoItemPersonal("Exercise", Importance.MEDIUM, 3, 45.0);
    toDoList.addItem(newItem);

    assertEquals(4, toDoList.size());
    assertEquals(newItem, toDoList.getItem(3));
  }


  @Test
  void getItem() {
    assertEquals(schoolItem1, toDoList.getItem(0));
    assertEquals(schoolItem2, toDoList.getItem(1));
    assertEquals(personalItem, toDoList.getItem(2));
  }

  @Test
  void remove() {
    boolean result = toDoList.remove(schoolItem1);

    assertTrue(result);
    assertEquals(2, toDoList.size());
    assertNotEquals(schoolItem1, toDoList.getItem(0));
  }

  @Test
  void size() {
    assertEquals(3, toDoList.size());
    toDoList.remove(schoolItem1);
    assertEquals(2, toDoList.size());
  }

  @Test
  void sortByUrgency() {
    toDoList.sortByUrgency();
    List<ToDoItem> sortedList = List.of(toDoList.getItem(0), toDoList.getItem(1), toDoList.getItem(2));

    assertEquals(schoolItem1, sortedList.get(0));
    assertEquals(schoolItem2, sortedList.get(1));
    assertEquals(personalItem, sortedList.get(2));
  }

  @Test
  void sortByImportance() {
    toDoList.sortByImportance();
    List<ToDoItem> sortedList = List.of(toDoList.getItem(0), toDoList.getItem(1), toDoList.getItem(2));

    assertEquals(schoolItem1, sortedList.get(0));
    assertEquals(schoolItem2, sortedList.get(1));
    assertEquals(personalItem, sortedList.get(2));
  }

  @Test
  void testToString() {
    String result = toDoList.toString();

    assertTrue(result.contains("java homework"));
    assertTrue(result.contains("c language homework"));
    assertTrue(result.contains("go to park"));
    assertTrue(result.startsWith("{"));
    assertTrue(result.endsWith("}"));
  }
}