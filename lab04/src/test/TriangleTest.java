import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * This class contains all the unit tests for various kinds of triangles
 */
public class TriangleTest {

  private Triangle triangle;

  @BeforeEach
  public void setUp() {
    Point2D point1 = new Point2D(0, 0);
    Point2D point2 = new Point2D(3, 0);
    Point2D point3 = new Point2D(0, 4);
    triangle = new Triangle(point1, point2, point3);
  }

  @Test
  public void testConstructorValid() {
    Point2D point1 = new Point2D(0, 0);
    Point2D point2 = new Point2D(1, 1);
    Point2D point3 = new Point2D(1, 2);
    Triangle validTriangle = new Triangle(point1, point2, point3);
    assertNotNull(validTriangle);
  }

  @Test
  public void testConstructorInvalid() {
    Point2D point1 = new Point2D(0, 0);
    Point2D point2 = new Point2D(0, 0); // Same as reference point
    Point2D point3 = new Point2D(1, 1);
    assertThrows(IllegalArgumentException.class, () -> {
      new Triangle(point1, point2, point3);
    });
  }

  @Test
  public void testArea() {
    double expectedArea = 6.0; // Area of a triangle with vertices (0,0), (3,0), and (0,4)
    assertEquals(expectedArea, triangle.area(), 0.001, "Area should be 6.0");
  }

  @Test
  public void testPerimeter() {
    double expectedPerimeter = 12.0; // Perimeter of a 3-4-5 triangle
    assertEquals(expectedPerimeter, triangle.perimeter(), 0.001, "Perimeter should be 12.0");
  }

  @Test
  public void testResize() {
    Triangle resizedTriangle = (Triangle) triangle.resize(4.0); // Area scaling factor of 4
    assertEquals(24.0, resizedTriangle.area(), 0.001, "Resized triangle's area should be 24.0");
    assertEquals(24.0, resizedTriangle.perimeter(), 0.001, "Resized triangle's perimeter should match the scaled value");
  }

  @Test
  public void testResizeInvalid() {
    assertThrows(IllegalArgumentException.class, () -> {
      triangle.resize(-1.0);
    }, "Resize factor must be positive");
  }

  @Test
  public void testToString() {
    String expected = "Triangle with area: 6.00";
    assertEquals(expected, triangle.toString(), "String representation should match");
  }
}