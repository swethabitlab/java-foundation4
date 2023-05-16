//write a java program to find sum of first digit and last digit of a positive integer
import java.util.Scanner;
public class Iterative7{
  public static void main(String args[]){
    SumOfFirstLast s=new SumOfFirstLast();
    s.sumFirstLast();
  }
} 
class SumOfFirstLast{
  public void sumFirstLast(){
    Scanner s=new Scanner(System.in);
    int n,first_digit,last_digit,sum;
    System.out.println("enter a positive integer");
    n=s.nextInt();
    last_digit=n%10;
    do{
      first_digit=n%10;
      n=n/10;
    }while(n>0);
    sum=first_digit+last_digit;
    System.out.println("sum of first and last digit is "+sum);
  }
}  