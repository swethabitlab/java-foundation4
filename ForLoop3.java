//WAP to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
public class ForLoop3{
  public static void main(String args[]){
    OddNumber n=new OddNumber();
    n.oddNumber();
  }
} 
class OddNumber{
  public void oddNumber(){
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("enter a number");
    n=s.nextInt();
    int sum=0;
    for(int i=1;i<=n;i=i+2)
      sum=sum+i;
    System.out.println("sum of odd numbers is "+sum);
  }
}