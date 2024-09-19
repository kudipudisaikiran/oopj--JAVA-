class A 
{
  public void display() 
  {
  	System.out.println("Parent class");
	}
}
class Inheritance extends A
 {
  public void run() 
  {
   	System.out.println("Child class");
	}
}
class Multiinheritance extends Inheritance
{
public void execute() 
  {
	  System.out.println("Multiple Inheritance");
	}
public static void main(String[] args)
{
	Multiinheritance obj = new Multiinheritance();
	obj.display();
	obj.run();
	obj.execute();
}
}
