//program to print 5 cities names
import java.util.Scanner;
public class Array2{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String city[]=new String[5];
    System.out.println("enter five cities names");
    for(int i=0;i<city.length;i++)
    city[i]=s.next();
     System.out.println("entered five cities names are:");
    for(int i=0;i<city.length;i++)
       System.out.println(city[i]);
  }
}