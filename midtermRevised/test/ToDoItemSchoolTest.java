import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoItemSchoolTest {
  private ToDoItemSchool requiredItem;
  private ToDoItemSchool optionalItem;

  @BeforeEach
  void setUp() {
    requiredItem = new ToDoItemSchool("Complete homework", Importance.HIGH, 10, true);
    optionalItem = new ToDoItemSchool("Prepare for club presentation", Importance.MEDIUM, 5, false);
  }

  @Test
  void getRequired() {
    assertTrue(requiredItem.getRequired());
    assertFalse(optionalItem.getRequired());
  }

  @Test
  void testToString() {
    String expectedRequired = "ToDoItem: Complete homework Importance: HIGH Urgency: 10 required: true";
    String expectedOptional = "ToDoItem: Prepare for club presentation Importance: MEDIUM Urgency: 5 required: false";

    assertEquals(expectedRequired, requiredItem.toString());
    assertEquals(expectedOptional, optionalItem.toString());
  }
}