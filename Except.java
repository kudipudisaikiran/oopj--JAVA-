class Except {
  public static void main(String[] args) {
 try {
 int divideByZero = 5 / 0;
      System.out.println("Rest of code in try block");
    }
    catch (ArithmeticException e) {
      System.out.println("ArithmeticException => " + e.getMessage());
    }
  }
}
