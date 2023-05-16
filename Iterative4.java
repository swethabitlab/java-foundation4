//WAP to calculate sum of digits of a number
import java.util.Scanner;
public class Iterative4{
  public static void main(String args[]){
    Sum s=new Sum();
    s.sum();
  }
} 
class Sum{
  public void sum(){
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("enter a number");
    n=s.nextInt();
    int sum=0;
    do{
      int digit=n%10;
      sum=sum+digit;
      n=n/10;
    }while(n!=0);
      System.out.println("sum of digits is "+sum);
  }
} 