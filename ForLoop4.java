//WAP to print multiplication table of any number.
import java.util.Scanner;
public class ForLoop4{
  public static void main(String args[]){
    MulTable n=new MulTable();
    n.mulTable();
  }
} 
class MulTable{
  public void mulTable(){
    Scanner s=new Scanner(System.in);
    int n,range;
    System.out.println("enter a number");
    n=s.nextInt();
    System.out.println("enter a range");
    range=s.nextInt();
    if(n<1||range<1)
       System.out.println("enter the positive integers only");
    else{
    for(int i=1;i<=range;i=i+1)
       System.out.println(n+"x"+i+"="+(n*i));
   }
  }
} 