
import Math.Fact;
import java.util.*;
class Ncr
{
 public static void main(String []args)
{
  Scanner sc = new Scanner(System.in);
  Fact obj = new Fact();
  int n = sc.nextInt();
  int r = sc.nextInt();
  int k = (obj.fact(n))/((obj.fact(n-r))*obj.fact(r));
  System.out.printf("%dC%d  =  %d\n",n,r,k);
}
}

