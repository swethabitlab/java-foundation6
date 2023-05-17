// WAP to check whether a number is palindrome or not.
import java.util.Scanner;
public class Palindrome{
  public static void main(String args[]){
    PalindromeNum p=new PalindromeNum();
    p.isPalindrome();
  }
}
class PalindromeNum{
  public void isPalindrome(){
    Scanner s=new Scanner(System.in);
    System.out.println("enter a number");
    int n=s.nextInt();
    int temp=n;
    int reverse=0;
    while(n>0){
      int digit=n%10;
      reverse=reverse*10+digit;
      n=n/10;
    }if(temp==reverse)
      System.out.println(n+" is a palindrome");
    else
      System.out.println(n+" is not a palindrome");
  }
}