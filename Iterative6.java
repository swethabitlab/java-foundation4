//WAP to print reverse of a number
import java.util.Scanner;
public class Iterative6{
  public static void main(String args[]){
    Reverse s=new Reverse();
    s.reverse();
  }
} 
class Reverse{
  public void reverse(){
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("enter a number");
    n=s.nextInt();
    int reverse=0;
    do{
      int digit=n%10;
      reverse=reverse*10+digit;
      n=n/10;
    }while(n>0);
      System.out.println("reverse of number is "+reverse);
  }
} 