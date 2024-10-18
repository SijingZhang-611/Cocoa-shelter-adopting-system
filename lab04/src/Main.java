import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Point2D p1 = new Point2D(0, 0);
    Point2D p2 = new Point2D(3, 1);
    Point2D p3 = new Point2D(0, 4);

    // Create Triangle instances
    Triangle triangle1 = new Triangle(p1, p2, p3);

    // Create another triangle
    Point2D p4 = new Point2D(1, 1);
    Point2D p5 = new Point2D(5, 2);
    Point2D p6 = new Point2D(2, 5);

    Triangle triangle2 = new Triangle(p4, p5, p6);

    // Create a list of shapes
    List<Shape> shapes = new ArrayList<>();
    shapes.add(triangle1);
    shapes.add(triangle2);

    // Sort by perimeter using PerimeterComparator
    Collections.sort(shapes, new PerimeterComparator());

    // Print the sorted shapes
    System.out.println("Shapes sorted by perimeter:");
    for (Shape shape : shapes) {
      System.out.println(shape);
    }
  }
}

