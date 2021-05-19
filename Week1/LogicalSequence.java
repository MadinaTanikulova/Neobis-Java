/*
 *javac -d . *.java
 *
 *java Logical_sequence
 *
 */
import java.util.Scanner;

public class LogicalSequence {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X, Y;
        X = sc.nextInt();
        Y = sc.nextInt();
        int[] array = new int[Y+1];
        for (int i = 1; i <= Y; i++){
            array[i] = i;
        }
        for (int k = 1; k <= Y; k++){
          if (array[k] % X == 0) {
            System.out.println(array[k]);
          }else {
            System.out.print(array[k] + " ");
          }
        }
   }
}
