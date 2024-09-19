class A {

  int x = 45;
}

class Super extends A {

  int x =100;

  void display() {
    System.out.println(x);
    System.out.println(super.x);
  }

  public static void main(String[] args) {
    Super obj = new Super();
   obj.display();
   }
   }
   
