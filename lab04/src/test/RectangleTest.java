import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * This class contains all the unit tests for various kinds of rectangles
 */
public class RectangleTest {

  private Rectangle rectangle1;
  private Rectangle rectangle2;

  @BeforeEach
  public void setUp() {
    // Initialize Rectangle objects before each test
    rectangle1 = new Rectangle(1, 2, 5, 3); // Rectangle at (1, 2) with width 5 and height 3
    rectangle2 = new Rectangle(0, 0, 10, 4); // Rectangle at (0, 0) with width 10 and height 4
  }

  @Test
  public void testRectangleConstructor() {
    // Test string representation for rectangle1
    String expectedString = "Rectangle: LL corner (1.000,2.000) width 5.000 height 3.000";
    assertEquals(expectedString, rectangle1.toString(), "Rectangle initialization should match expected string format");
  }

  @Test
  public void testArea() {
    // Test the area calculation
    double expectedArea = 5 * 3; // Area = width * height
    assertEquals(expectedArea, rectangle1.area(), "Rectangle area should be calculated correctly");
  }

  @Test
  public void testPerimeter() {
    // Test the perimeter calculation
    double expectedPerimeter = 2 * (5 + 3); // Perimeter = 2 * (width + height)
    assertEquals(expectedPerimeter, rectangle1.perimeter(), "Rectangle perimeter should be calculated correctly");
  }

  @Test
  public void testResize() {
    // Test resizing the rectangle
    Rectangle resizedRectangle = (Rectangle) rectangle1.resize(4); // Resizing with a factor of 4
    double expectedWidthAfterResize = Math.sqrt(4) * 5; // New width should be 10
    double expectedHeightAfterResize = Math.sqrt(4) * 3; // New height should be 6
    String expectedString = String.format("Rectangle: LL corner (1.000,2.000) width %.3f height %.3f",
        expectedWidthAfterResize, expectedHeightAfterResize);
    assertEquals(expectedString, resizedRectangle.toString(), "Resized rectangle string representation should match expected format");
  }

  @Test
  public void testToString() {
    // Test the string representation
    String expectedString = "Rectangle: LL corner (1.000,2.000) width 5.000 height 3.000";
    assertEquals(expectedString, rectangle1.toString(), "String representation of the rectangle should match expected format");
  }
}