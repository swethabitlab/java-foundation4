// WAP to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
public class Iterative{
  public static void main(String args[]){
    NaturalNumber n=new NaturalNumber();
    n.naturalNumber();
  }
}
class NaturalNumber{
  public void naturalNumber(){
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("enter a number");
    n=s.nextInt();
    int i=1;
    int sum=0;
    do{
      sum=sum+i;
      i=i+1;
    }
      while(i<=n);
      System.out.println("sum of natural numbers is "+sum);
  }
}