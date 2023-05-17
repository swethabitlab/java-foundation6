//WAP to find where the key element is placed in an array
import java.util.Scanner;
public class Array5{
  public static void main(String args[]){
    Key k=new Key();
    k.isKey();
  }
}
class Key{
  public void isKey(){
    Scanner s=new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("enter the elements of array");
    for(int i=0;i<5;i++){
      arr[i]=s.nextInt();
    }
    System.out.println("enter key value");
    int key=s.nextInt();
    for(int i=0;i<5;i++){
      if(key==arr[i]){
       System.out.println(key+" is placed at "+ i +" index of array"); 
      break;}
      else
        System.out.println("key is not found");
    }
    
  }
}