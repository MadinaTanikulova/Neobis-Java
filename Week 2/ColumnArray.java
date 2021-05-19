/*
 *javac -d . *.java
 *
 *java Column_in_array
 *
 */

import java.util.Scanner;

public class ColumnArray {   
  public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int C = Integer.parseInt(in.nextLine());
          char T = in.next().charAt(0);
          float[][] M = new float[12][12];
            
          for (int i = 0; i < 12; i++){
            for (int j = 0; j < 12; j++){
            M[i][j] = in.nextFloat();           
            }
          }
          double result = 0;
          for (int i = 0; i < 12; i++){
            for (int j = 0; j < 12; j++){
               if (j == C){
                  result + = M[i][j];
               }
            }
          }
       switch(T){
       case 'S':
        System.out.printf("%.1f\n", result);
        break;
             
       case 'M':
        System.out.printf("%.1f\n", result / 12);
        break;
       }
   }
}
