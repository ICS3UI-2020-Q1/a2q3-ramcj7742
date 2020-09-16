import java.util.Scanner;

/**
 * Sorts users number in ascending order
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    //gets users first number
    System.out.println("Please enter an integer:");
    int a = input.nextInt();

    //gets users second number
    System.out.println("Please enter another integer:");
    int b = input.nextInt();

    // sorts numbers in ascending order
    if (a >= b) {
      System.out.println("Your numbers in ascending order are " + b + ", " + a);
    } else {
      System.out.println("Your numbers in ascending order are " + a + ", " + b);
    }
    
  }
}
