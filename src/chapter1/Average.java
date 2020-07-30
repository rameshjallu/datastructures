package chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Average
{
 
   public static void main(String[] args)
   {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
 
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter a list of numbers: ");
       
      while (in.hasNextInt())
      {
         int input = in.nextInt();
         numbers.add(input);
         
         System.out.println(numbers);
         
      }
 
      if (numbers.size() == 0)
      {
         System.out.println("No average.");
 
      } 
       
      else
      {
         int total = 0;
         for (int element : numbers)
         {
            total = total + element;
         }
         double average = total / numbers.size();
         System.out.println("The average is: " + average);
 
      }
   }
}
