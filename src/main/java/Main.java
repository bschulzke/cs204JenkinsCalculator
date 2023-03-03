public class Main {

  public static void main(String args[]) {

    Calculator calculator = new Calculator();

    String operation = args[0];

    int a = Integer.parseInt(args[1]);
    int b = Integer.parseInt(args[2]);
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
