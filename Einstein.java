import java.util.Scanner;

/**
 * Uses Einstein's equation to calculate mass'.
 *
 * @author Jessah
 * @version 1.0 @2024-02-27
 */
public final class Einstein {

  /** Private constructor to prevent instantiation of this utility class. */
  private Einstein() {
    // whitespace
  }

  /**
   * Print message.
   *
   * @param args Command-line arguments (not used in program).
   */
  public static void main(final String[] args) {

    // Declare constants for Speed of light.
    final double speedOfLight = 299792458;

    try {

      // Get user input.
      System.out.print("Enter the mass of your object (kg): ");
      final Scanner input = new Scanner(System.in);
      final String maString = input.nextLine();

      // Convert string to double.
      final double mass = Double.parseDouble(maString);

      // If user enters a mass
      if (mass >= 1) {
        final double userEnergy = mass * (Math.pow(speedOfLight, 2));
        System.out.print("The amount of energy is ");
        System.out.format("%.3f", userEnergy);
        System.out.print("J");
        System.out.println();
      } else {
        // If user enters a number under 1.
        System.out.print("A mass must be positive.");
        System.out.println();
      }
      input.close();
    } catch (NumberFormatException error) {
      // For any string input.
      System.out.println("Mass cannot be a " + error.getMessage());
      System.out.println();
    }
  }
}
