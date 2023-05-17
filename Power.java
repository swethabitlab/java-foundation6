//WAP to find power of a number using for loop.
import java.util.Scanner;
public class Power{
  public static void main(String args[]){
    PowerNum p=new PowerNum();
    p.isPower();
  }
}
class PowerNum{
  public void isPower(){
    Scanner s=new Scanner(System.in);
    System.out.println("enter base value");
    int b=s.nextInt();
    System.out.println("enter exponent value");
    int e=s.nextInt();
    int power=1;
    for(int i=1;i<=e;i++)
      power=power*b;
      System.out.println(b+" to the power "+e+" is:"+power);
  }
} 