// Rhea Toves
// 1/19/2021
// TA: Jeremy Chen
// Assignment #2, Part B: Rocket Ship
//
// This program will generate an image of a
// rocket ship as output. This version includes a class
// constant for drawing rocket ships of different sizes.

public class DrawRocket {
   public static final int SIZE = 3;
   
   // generates the rocket ship
   public static void main(String[] args) {
      drawTriangle();
      drawLine();
      drawHalfOfTopHalf();
      drawHalfOfBottomHalf();
      drawLine();
      drawHalfOfBottomHalf();
      drawHalfOfTopHalf();
      drawLine();
      drawTriangle();
      
   }
   
   // generates the top and bottom triangular shape
   public static void drawTriangle() {
      for (int i = 1; i <= 2 * SIZE - 1; i++) {
         for (int j = 1; j <= (-1 * i + 2 * SIZE); j++) {
            System.out.print(" ");
         }
         for (int k = 1; k <= i; k++) {
            System.out.print("/");
         }
         System.out.print("**");
         for (int l = 1; l <= i; l++) {
            System.out.print("\\");
         }
         System.out.println();
      }
   }
   
   // generates the line
   public static void drawLine() {
      System.out.print("+");
      for (int i = 1; i <= (2 * SIZE); i++) {
         System.out.print("=*");
      }
      System.out.println("+");
   }
   
   // generates the top half of the top half
   public static void drawHalfOfTopHalf() {
      for (int i = 1; i <= SIZE; i++) {
         System.out.print("|");
         for (int dots = 1; dots <= (-1 * i + SIZE); dots++) {
            System.out.print(".");
         }
         for (int j = 1; j <= i; j++) {
            System.out.print("/\\");
            
         }
         for (int k = 1; k <= (-2 * i + 2 * SIZE); k++) {
            System.out.print(".");
         }
         for (int j = 1; j <= i; j++) {
            System.out.print("/\\");
            
         }
         for (int dots = 1; dots <= (-1 * i + SIZE); dots++) {
            System.out.print(".");
            
         }
         System.out.println("|");
      }
   }
   
   // generates the top half of the top half but in reverse
   public static void drawHalfOfBottomHalf() {
      for (int i = SIZE; i >= 1; i--) {
         System.out.print("|");
         for (int dots = 1; dots <= (-1 * i + SIZE); dots++) {
            System.out.print(".");
         }
         for (int j = 1; j <= i; j++) {
            System.out.print("\\/");
            
         }
         for (int k = 1; k <= (-2 * i + 2 * SIZE); k++) {
            System.out.print(".");
         }
         for (int j = 1; j <= i; j++) {
            System.out.print("\\/");
            
         }
         for (int dots = 1; dots <= (-1 * i + SIZE); dots++) {
            System.out.print(".");
            
         }
         System.out.println("|");
      }
      
   }
   
}