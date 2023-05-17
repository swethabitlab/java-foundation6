//WAP to find maximum temparature of a week
import java .util.Scanner;
public class Array3{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    double Temp[]= new double[7];
    System.out.println("enter temparature values");
    for(int i=0;i<7;i++){
      Temp[i]=s.nextDouble();
    }
    double max=Temp[0];
    for(int i=0;i<7;i++){
       if(max < Temp[i])
        max=Temp[i];
      }
    System.out.println("maximum temperature is:"+ max);
    }
}