import java.util.Scanner;

public class Main {

  public static void main(String args[]) {

    Calculator calculator = new Calculator();

    System.out.println("Enter a command: ");

    Scanner s = new Scanner(System.in);

    String operation = s.next();
    int a = s.nextInt();
    int b = s.nextInt();

    int result = -1000000000;
    String binary;

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

  }

}
