import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * This class contains all the unit tests for various kinds of circles
 */
public class CircleTest {

  private Circle circle1;
  private Circle circle2;

  @BeforeEach
  public void setUp() {
    // Initialize Circle objects before each test
    circle1 = new Circle(3, 4, 5); // Circle centered at (3, 4) with radius 5
    circle2 = new Circle(10);      // Circle centered at (0, 0) with radius 10
  }

  @Test
  public void testCircleConstructorWithCenter() {
    // Instead of getting center values, use toString() to verify the initialization
    String expectedString = "Circle: center (3.000,4.000) radius 5.000";
    assertEquals(expectedString, circle1.toString(), "Circle initialization should match expected string format");
  }

  @Test
  public void testCircleConstructorWithDefaultCenter() {
    // Check default center using toString() for circle2
    String expectedString = "Circle: center (0.000,0.000) radius 10.000";
    assertEquals(expectedString, circle2.toString(), "Circle initialization should match expected string format");
  }

  @Test
  public void testArea() {
    // Test the area calculation
    double expectedArea = Math.PI * 5 * 5; // Area = π * r²
    assertEquals(expectedArea, circle1.area(), "Circle area should be calculated correctly");
  }

  @Test
  public void testPerimeter() {
    // Test the perimeter calculation
    double expectedPerimeter = 2 * Math.PI * 5; // Perimeter = 2 * π * r
    assertEquals(expectedPerimeter, circle1.perimeter(), "Circle perimeter should be calculated correctly");
  }

  @Test
  public void testResize() {
    // Test resizing the circle
    Circle resizedCircle = (Circle) circle1.resize(4); // Resizing with a factor of 4
    double expectedRadiusAfterResize = Math.sqrt(4) * 5; // New radius should be 10
    String expectedString = String.format("Circle: center (3.000,4.000) radius %.3f", expectedRadiusAfterResize);
    assertEquals(expectedString, resizedCircle.toString(), "Resized circle string representation should match expected format");
  }

  @Test
  public void testToString() {
    // Test the string representation
    String expectedString = "Circle: center (3.000,4.000) radius 5.000";
    assertEquals(expectedString, circle1.toString(), "String representation of the circle should match expected format");
  }
}