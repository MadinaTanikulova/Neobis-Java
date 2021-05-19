/*
 *javac -d . *.java
 *
 *java Population_increase
 *
 */

import java.util.Scanner;

public class PopulationIncrease {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int N = Integer.parseInt(scanner.nextLine());
        
          for(int i = 0; i < N; i++){
            String[] array = scanner.nextLine().split(" ");
            int PA = Integer.parseInt(array[0]);
            int PB = Integer.parseInt(array[1]);
            double g1 = Double.parseDouble(array[2]);
            double g2 = Double.parseDouble(array[3]);


            int count = 0;
            while (PA <= PB) {
                PA = (int) (PA + PA * (g1 / 100));
                PB = (int) (PB + PB * (g2 / 100));
                count++;
                if(count > 100){
                    break;
                }
            }
            if(count <= 100) {
            System.out.println(count + " anos.");
            }else {
            System.out.println("Mais de 1 seculo.");
            }
         }
    }
}
