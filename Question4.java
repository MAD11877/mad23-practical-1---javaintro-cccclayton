import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
    
    System.out.println("Enter the length of the base of the triangle: ");
    Scanner in = new Scanner(System.in);
    int length = in.nextInt();

    for (int i = length; i>0; i--){
     for (int x = i; x>0; x--){
      System.out.print("*");
     }
     System.out.println("");
    }

    
  }
}
