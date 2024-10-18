import java.util.Comparator;
/**
 * This class represents a PerimeterComparator.
 */
public class PerimeterComparator implements Comparator<Shape> {

  @Override
  public int compare(Shape shape1, Shape shape2) {
    // Calculate the perimeters of both shapes
    double perimeter1 = shape1.perimeter();
    double perimeter2 = shape2.perimeter();

    // Compare based on perimeter
    return Double.compare(perimeter1, perimeter2);
  }
}
