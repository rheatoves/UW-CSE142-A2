// Rhea Toves
// 1/19/2021
// TA: Jeremy Chen
// Assignment #2, Part A: ASCII Art
//
// This program produces as output an
// ASCII art representation of a wedding cake.

public class AsciiArt {
   public static void main(String[] args) {
      for (int line = 1; line <= 4; line++) {
         for (int straight = 1; straight <= (-1 * line + 7); straight++) {
            System.out.print("|");
         }
         for (int star = 1; star <= (2 * line -2); star++) {
            System.out.print("*");
            
         }
         for (int straight = 1; straight <= (-1 * line + 7); straight++) {
            System.out.print("|");
            
         }
         System.out.println();
      }
   }
}