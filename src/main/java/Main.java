import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Welcome to the calculator");

    Scanner scan = new Scanner(System.in);
    Calculator calculator = new Calculator();
    while (true) {
      System.out.println("Enter a command:");

      String input = scan.nextLine();
      String[] split = input.split(" ");
      if (split[0].equalsIgnoreCase("quit")) {
        break;
      }

      String command = split[0].toLowerCase();
      int num1 = Integer.parseInt(split[1]);

      if (command.equals("add")) {
        System.out.println(calculator.add(num1, Integer.parseInt(split[2])));
      } else if (command.equals("subtract")) {
        System.out.println(calculator.subtract(num1, Integer.parseInt(split[2])));
      } else if (command.equals("multiply")) {
        System.out.println(calculator.multiply(num1, Integer.parseInt(split[2])));
      } else if (command.equals("divide")) {
        System.out.println(calculator.divide(num1, Integer.parseInt(split[2])));
      } else if (command.equals("fibonacci")) {
        System.out.println(calculator.fibonacciNumberFinder(num1));
      } else if (command.equals("binary")) {
        System.out.println(calculator.intToBinaryNumber(num1));
      }

    }
  }
}
