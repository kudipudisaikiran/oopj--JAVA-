import java.util.*;
public class Bubble{
    static void sort(int a[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
    }
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of a Array=");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter elements=");
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
    sort(a,a.length);
    System.out.println("After sorting=");
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
}
}
