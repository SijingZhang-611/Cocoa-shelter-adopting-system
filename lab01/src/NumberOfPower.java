public class NumberOfPower {
  public static void main(String[] args) {
    double base = 2.0;    // Base number
    int exponent = 3; // Exponent

    // Calculate power manually
    int result = 1;
    for (int i = 0; i < exponent; i++) {
      result *= base;
    }

    // Print the result
    System.out.println(base + " raised to the power of " + exponent + " is " + result);
  }
}
