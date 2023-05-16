//WAP to find sum of all even numbers between 1 to n.
import java.util.Scanner;
public class ForLoop2{
  public static void main(String args[]){
    EvenNumber n=new  EvenNumber();
    n.evenNumber();
  }
} 
class EvenNumber{
  public void evenNumber(){
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("enter a number");
    n=s.nextInt();
    int sum=0;
    for(int i=0;i<=n;i=i+2)
      sum=sum+i;
    System.out.println("sum of even numbers is "+sum);
  }
}