import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewShoeTest {

  // Test for Constructor with valid data
  @Test
  public void testConstructorValidData() {
    NewShoe shoe = new NewShoe("Sneakers", Color.RED, "Nike", 42.5);
    assertEquals("Sneakers", shoe.getType());
    assertEquals(Color.RED, shoe.getColor());
    assertEquals("Nike", shoe.getBrand());
    assertEquals(42.5, shoe.getSize());
  }

  // Test for Constructor with empty type
  @Test
  public void testConstructorEmptyType() {
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
      new NewShoe("", Color.RED, "Nike", 42.5);
    });
    assertEquals("Shoe type cannot be empty.", exception.getMessage());
  }

  // Test for getType method
  @Test
  public void testGetType() {
    NewShoe shoe = new NewShoe("Boots", Color.BLACK, "Adidas", 40);
    assertEquals("Boots", shoe.getType());
  }

  // Test for getColor method
  @Test
  public void testGetColor() {
    NewShoe shoe = new NewShoe("Boots", Color.GREEN, "Adidas", 40);
    assertEquals(Color.GREEN, shoe.getColor());
  }

  // Test for getBrand method
  @Test
  public void testGetBrand() {
    NewShoe shoe = new NewShoe("Boots", Color.YELLOW, "Puma", 39);
    assertEquals("Puma", shoe.getBrand());
  }

  // Test for getSize method
  @Test
  public void testGetSize() {
    NewShoe shoe = new NewShoe("Loafers", Color.PINK, "Gucci", 38);
    assertEquals(38, shoe.getSize());
  }

  // Test for toString method with customized color
  @Test
  public void testToStringCustomizedColor() {
    NewShoe shoe = new NewShoe("Sneakers", Color.RED, "Nike", 42.5);
    String expected = "The type of this shoe is: Sneakers\n" +
        "The color of this shoe is: Red\n" +
        "The brand of this shoe is: Nike\n" +
        "The size of this shoe is: 42.5";
    assertEquals(expected, shoe.toString());
  }

  // Test for toString method with default color
  @Test
  public void testToStringDefaultColor() {
    NewShoe shoe = new NewShoe("Boots", Color.PURPLE, "Timberland", 43);
    String expected = "The type of this shoe is: Boots\n" +
        "The color of this shoe is: To Be Determined\n" +
        "The brand of this shoe is: Timberland\n" +
        "The size of this shoe is: 43";
    assertEquals(expected, shoe.toString());
  }
}