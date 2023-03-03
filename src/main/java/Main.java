import java.util.Scanner;

public class Main {

  breaking the pipeline

  public static void main(String args[]) {

    Calculator calculator = new Calculator();

    System.out.println("Welcome to the Calculator.");

    System.out.println("Enter a command: ");

    Scanner s = new Scanner(System.in);

    String operation = s.next();
    if (operation.equals("q")) {
      System.out.println("Goodbye!");
      return;
    }
    int a = s.nextInt();
    int b = -100000;
    if (!operation.equals("fib") && !operation.equals("binary")) {
      b = s.nextInt();
    }

    int result = -1000000000;
    String binary;

    while (!operation.equals("q")) {
      if (operation.equals("add")) {
        result = calculator.add(a, b);
      }
      if (operation.equals("subtract")) {
        result = calculator.subtract(a, b);
      }
      if (operation.equals("multiply")) {
        result = calculator.multiply(a, b);
      }
      if (operation.equals("divide")) {
        result = calculator.divide(a, b);
      }
      if (operation.equals("fib")) {
        result = calculator.fibonacciNumberFinder(a);
      }
      if (operation.equals("binary")) {
        binary = calculator.intToBinaryNumber(a);
        System.out.println(binary);
        return;
      }

      System.out.println(result);
      System.out.println("Enter a command: ");
      operation = s.next();
      if (operation.equals("q")) {
        System.out.println("Goodbye!");
        return;
      }
      a = s.nextInt();
      if (!operation.equals("fib") && !operation.equals("binary")) {
        b = s.nextInt();
      }
    }
  }

}
