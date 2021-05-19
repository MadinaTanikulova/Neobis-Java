/*
 *javac -d . *.java
 *
 *java Banknotes
 *
 */

import java.util.Scanner;

public class Banknotes {
   static int N;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        System.out.println(N);
        System.out.println(Result(100) + " nota(s) de R$ 100,00\n" +
                           Result(50) + " nota(s) de R$ 50,00\n" +
                           Result(20) + " nota(s) de R$ 20,00\n" +
                           Result(10) + " nota(s) de R$ 10,00\n" +
                           Result(5) + " nota(s) de R$ 5,00\n" +
                           Result(2) + " nota(s) de R$ 2,00\n" +
                           Result(1) + " nota(s) de R$ 1,00");
   }

    public static int Result(int banknote){
        int resultofBanknotes = 0;
        if (N >= banknote) {
            resultofBanknotes = N / banknote;
            N % = banknote;
        }
        return resultofBanknotes;                                    
    }
}
