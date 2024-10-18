import java.awt.Point;
import java.util.Comparator;

// Question3:
// 1.Which parts of which files would have needed to be modified?
// AbstractShape compareTo method should be modified.
// 2. If it were not for sharing code via AbstractShape.java, how many files would have needed modification?
// we need to modify Shapes for Rectangle, Circle, and Triangle.
/**
 * This class represents a triangle.  It defines all the operations mandated by
 * the Shape interface
 */
public class Triangle extends AbstractShape {

  public Point2D point2;
  public Point2D point3;

  public Triangle(Point2D reference, Point2D point2, Point2D point3) {
    super(reference);
    this.point2 = point2;
    this.point3 = point3;

    if (point2.getX()==point3.getX() && point2.getY()==point3.getY()
        || reference.getX()==point2.getX() && reference.getY()==point2.getY()
        || reference.getX()==point3.getX() && reference.getY()==point3.getY()) {
      throw new IllegalArgumentException("Triangle points are equal");
    }
  }

  //Methods to calculate.

  /**
   * Computes and returns the area of this shape.
   *
   * @return the area of the shape
   */
  @Override
  public double area() {
    double x1 = this.reference.getX();
    double y1 = this.reference.getY();
    double x2 = this.point2.getX();
    double y2 = this.point2.getY();
    double x3 = this.point3.getX();
    double y3 = this.point3.getY();
    double area = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    return area;
  }


  /**
   * Computes and returns the perimeter of this shape.
   *
   * @return the perimeter of the shape
   */
  public double perimeter() {
    double side1 = this.reference.distanceTo(point2);
    double side2 = this.point2.distanceTo(point3);
    double side3 = this.point3.distanceTo(this.reference);
    return side1 + side2 + side3;
  }

  /**
   * Create and return a shape of the same kind as this one, resized in area by the provided factor
   *
   * @param factor the area multiplier for resizing
   * @return the resized Shape
   */
  @Override
  public Shape resize(double factor) {
    if (factor <= 0) {
      throw new IllegalArgumentException("Resize factor must be positive.");
    }

    // Calculate scaling factor for side lengths (sqrt of area factor)
    double scaleFactor = Math.sqrt(factor);

    // Get the scaled points (scaling from the reference point)
    Point2D newPoint2 = scalePoint(this.reference, this.point2, scaleFactor);
    Point2D newPoint3 = scalePoint(this.reference, this.point3, scaleFactor);

    // Return the new scaled Triangle
    return new Triangle(this.reference, newPoint2, newPoint3);
  }

  // Helper method to scale a point relative to the reference point

  private Point2D scalePoint(Point2D reference, Point2D point, double scaleFactor) {
    double newX = reference.getX() + (point.getX() - reference.getX()) * scaleFactor;
    double newY = reference.getY() + (point.getY() - reference.getY()) * scaleFactor;
    return new Point2D(newX, newY);
  }

  // Override toString method
  @Override
  public String toString() {
    return String.format("Triangle with area: %.2f",
        this.area());
  }
}
