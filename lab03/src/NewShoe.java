/**
 * Represents shoes with attributes such as type, color, brand, and size.
 */
public class NewShoe {
  private String type;
  private Color color;
  private String brand;
  private double size;

  /**
   * Constructs a shoes object with the specified type, color, brand, and size.
   * @param type the type of the shoes.
   * @param color the color of the shoes.
   * @param brand the brand of the shoes.
   * @param size the size of the shoes.
   */
  public NewShoe(String type, Color color, String brand, double size){
    if (type == null|| type.isEmpty()) {
      throw new IllegalArgumentException("Shoe type cannot be empty.");
    }
    this.type=type;
    this.color=color!= null ? color : Color.UNDEFINED;
    this.brand=brand;
    this.size=size;
  }

  /**
   * Returns the type of the shoes.
   *
   * @return the type of the shoes.
   */
  public String getType(){
    return type;
  }

  /**
   * Returns the color of the shoes.
   * @return the color of the shoes.
   */
  public Color getColor(){
    return color;
  }

  /**
   * return the brand of the shoes
   * @return the brand of the shoes.
   */
  public String getBrand(){
    return brand;
  }

  /**
   * return the size of the shoes.
   * @return the size of the shoes.
   */
  public double getSize(){
    return size;
  }

  /**
   * return the string of all the information of the shoes.(type,color,brand,size)
   * @return the string of all the information of the shoes.(type,color,brand,size)
   */
  public String toString(){
    String colorString;
    switch (color) {
      case RED:
        colorString = "Red";
        break;
      case BLUE:
        colorString = "Blue";
        break;
      case GREEN:
        colorString = "Green";
        break;
      case BLACK:
        colorString = "Black";
        break;
      case WHITE:
        colorString = "White";
        break;
      default:
        colorString = "To Be Determined";
        break;
    }
    return "The type of this shoe is: " + this.type + "\n" +
        "The color of this shoe is: " + colorString + "\n" +
        "The brand of this shoe is: " + this.brand + "\n" +
        "The size of this shoe is: " + this.size;
  }

}
