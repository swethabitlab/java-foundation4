// WAP to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
public class ForLoop1{
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
    int sum=0;
    for(int i=1;i<=n;i++){
      sum=sum+i;
    }
     System.out.println("sum of natural numbers is "+sum);
  }
}