/**
 * Represents shoes with attributes such as type, color, brand, and size.
 */
public class Shoes {
  private String type;
  private String color;
  private String brand;
  private double size;

  /**
   * Constructs a shoes object with the specified type, color, brand, and size.
   * @param type the type of the shoes.
   * @param color the color of the shoes.
   * @param brand the brand of the shoes.
   * @param size the size of the shoes.
   */
  public Shoes(String type, String color, String brand, double size){
    this.type=type;
    this.color=color;
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
  public String getColor(){
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
    return "The type of this shoe is: " + type + "\n" +
        "The color of this shoe is: " + color + "\n" +
        "The brand of this shoe is: " + brand + "\n" +
        "The size of this shoe is: " + size;
  }

}
