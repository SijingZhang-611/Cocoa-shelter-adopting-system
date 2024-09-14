public class Adder {

  // Method to add two numbers
  private int addNumbers(int num1, int num2) {
    int res=num1+num2;
    return res;
  }

 public static void main(String[] args) {
    // Create an object of the Adder class
    Adder adder = new Adder();
    // Add two numbers using the addNumbers method
    int result = adder.addNumbers(5, 10);

    // Print the result
    System.out.println("The sum of 5 and 10 is " + result);
  }
}