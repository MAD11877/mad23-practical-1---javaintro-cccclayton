import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
     
     while (true){
      //Getting list size
      System.out.print("How many numbers will you enter: ");
      Scanner in = new Scanner(System.in);
      int listSize = in.nextInt();
    
      //Create list and placeholders
      ArrayList<Integer> intList = new ArrayList<Integer>();
      int maxCount = 0;
      int mode = 0;

      //Add integers into list
      for (int i = 0; i<listSize; i++){
      System.out.print("Enter an integer: ");
      Scanner in2Scanner = new Scanner(System.in);
      intList.add(in2Scanner.nextInt());
      
      //Get mode
      for (int x = 0; x<intList.size(); x++)
      {
        int count = 0;
        for (int z = 0; z<intList.size(); z++)
        {
          if (intList.get(z) == intList.get(x))
          {
            count++;
          }
        }
        if (count> maxCount)
        {
          maxCount = count;
          mode = intList.get(x);
        }
      }
      System.out.println("The mode is: " + mode);
    }
     
  }
 } 
}

