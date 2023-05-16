//WAP to print multiplication table of any number.
import java.util.Scanner;
public class Iterative3{
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
    int i=1;
    if(n<1||range<1)
       System.out.println("enter the positive integers only");
    else{
    do{
       System.out.println(n+"x"+i+"="+(n*i));
      i=i+1;
    }while(i<=range);
   }
  }
} 