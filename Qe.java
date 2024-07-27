
import java.util.*;
class Qe{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
 double d=(b*b)-(4*a*c);
 double e=Math.sqrt(d);
 double x=(-e)/(2*a);
 if(e==0){
 root=root2=(-b)/(2*a);
 System.out.println("the roots are equal"+x,root1);
 }
 else if(e>0){

  root1=((-b)+e)/(2*a);
   root2=((-b)-e)/(2*a);
  System.out.println("the roots are real & distinct"+x,root1,root2);
  }
  else{
   System.out.println("the roots are unequal"+x);
   }
   }
   }
