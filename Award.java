import java.util.*;
public class Award
{
   public static void main(String[] args)
   {
      int award;

      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of activity participation awards: ");
      award = input.nextInt();
      input.close();

      if (award >= 100000) 
      {
         System.out.println("Gold Medal");
      }
      else if (award >= 14)
      {
         System.out.println("Gold Medal");
      }
      else if (award >= 10) 
      {
         System.out.println("Silver Medal");
      }
      else if (award >= 5) 
      {
         System.out.println("Bronze Medal");
      }
      else  
      {
         System.out.println("You did not qualify for an overall participation medal");
      }
   }
}					