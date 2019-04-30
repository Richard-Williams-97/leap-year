import java.util.Scanner;

public class LeapYear{
   public static void main(String[]args){
   
      int year;
      boolean isLeap;
      Scanner kb=new Scanner(System.in);
   
      System.out.print("Enter a year: ");
      try{
         year=(int)kb.nextDouble();
      
      
         if((year%4==0)&&(year%100!=0)||(year%400==0))
         {
            System.out.print(year+" is a leap year.");
         }
         else
         {
            System.out.print(year+" is not a leap year.");
         }
      }catch(Exception r){System.out.println("That was not a year.");}
      
   }}
