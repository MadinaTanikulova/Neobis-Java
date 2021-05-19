/*
 *javac -d . *.java
 *
 *java Grenais
 *
 */

import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int InterScore = 0;
        int GremioScore = 0;
        int Equal = 0;
        String result = "Não houve vencedor";
          int count = 0;
        do {
            int[] array = new int[2];
            array[0] = scanner.nextInt();
            array[1] = scanner.nextInt();
            count++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            if(array[0] > array[1]){
                InterScore++;
            }else if(array[0] < array[1]){
                GremioScore++;
            }else
                Equal++;
            }
        } while (scanner.nextInt() != 2);

        if(InterScore > GremioScore) {
            result = "Inter venceu mais";
        }else if(InterScore < GremioScore) {
            result = "Gremio venceu mais";
        }


    System.out.print(count + " grenais\n" +"Inter:" + InterScore + "\n");
    System.out.println("Gremio:" + GremioScore + "\n" + "Empates:" + Equal + "\n" + result );
    }
}
