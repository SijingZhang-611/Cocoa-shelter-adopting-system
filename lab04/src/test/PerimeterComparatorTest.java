import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * This class contains all the unit tests for PerimeterComparator
 */
public class PerimeterComparatorTest {

  private PerimeterComparator comparator;
  private Shape triangle1;
  private Shape triangle2;
  private Shape rectangle;

  @BeforeEach
  public void setUp() {
    comparator = new PerimeterComparator();

    // Create test shapes with known perimeters
    Point2D point1 = new Point2D(0, 0);
    Point2D point2 = new Point2D(3, 0);
    Point2D point3 = new Point2D(0, 4);
    triangle1 = new Triangle(point1, point2, point3); // 3-4-5 triangle with perimeter 12.0

    Point2D point4 = new Point2D(0, 0);
    Point2D point5 = new Point2D(6, 0);
    Point2D point6 = new Point2D(0, 8);
    triangle2 = new Triangle(point4, point5, point6); // Scaled triangle with perimeter 30.0

    // Initialize rectangle with lower-left corner (0, 0), width 5, and height 5 (perimeter 20.0)
    rectangle = new Rectangle(0, 0, 5, 5); // Rectangle with perimeter 20.0
  }

  @Test
  public void testCompareSmallerPerimeter() {
    // Triangle1 (12.0) is smaller than Rectangle (20.0)
    assertTrue(comparator.compare(triangle1, rectangle) < 0, "triangle1 should have a smaller perimeter than rectangle");
  }

  @Test
  public void testCompareLargerPerimeter() {
    // Triangle2 (30.0) is larger than Rectangle (20.0)
    assertTrue(comparator.compare(triangle2, rectangle) > 0, "triangle2 should have a larger perimeter than rectangle");
  }

  @Test
  public void testCompareEqualPerimeter() {
    // Two triangles with the same perimeter should return 0
    assertEquals(0, comparator.compare(triangle1, triangle1), "Comparing the same shape should return 0");
  }
}