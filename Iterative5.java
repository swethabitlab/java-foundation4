//WAP to calculate product of digits of a number
import java.util.Scanner;
public class Iterative5{
  public static void main(String args[]){
    Product s=new Product();
    s.product();
  }
} 
class Product{
  public void product(){
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("enter a number");
    n=s.nextInt();
    int product=1;
    do{
      int digit=n%10;
      product=product*digit;
      n=n/10;
    }while(n!=0);
      System.out.println("product of digits is "+product);
  }
} 