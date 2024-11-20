import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoItemPersonalTest {
  private ToDoItemPersonal item1;
  private ToDoItemPersonal item2;

  @BeforeEach
  void setUp() {
    item1 = new ToDoItemPersonal("Study for exam", Importance.HIGH, 8, 120.0);
    item2 = new ToDoItemPersonal("Go grocery shopping", Importance.MEDIUM, 5, 45.0);
  }

  @Test
  void getPrepTime() {
    assertEquals(120.0, item1.getPrepTime());
    assertEquals(45.0, item2.getPrepTime());
  }

  @Test
  void testToString() {
    String expected1 = "ToDoItem: Study for exam Importance: HIGH Urgency: 8 PrepTime: 120.0";
    String expected2 = "ToDoItem: Go grocery shopping Importance: MEDIUM Urgency: 5 PrepTime: 45.0";
    assertEquals(expected1, item1.toString());
    assertEquals(expected2, item2.toString());
  }
}