//program to print integer values
import java.util.Scanner;
public class Array1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int marks[]=new int[5];
    System.out.println("enter the elements");
    for(int i=0;i<marks.length;i++)
      marks[i]=sc.nextInt();
    System.out.println("entered elements are:");
    for(int i=0;i<marks.length;i++)
      System.out.println(marks[i]);
  }
}