/*
 *javac -d . *.java
 *
 *java Banknotes_Coins
 *
 */

import java.util.Scanner;

public class BanknotesCoins {
  private static int notes;
  private  static int coins;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextDouble();
        notes = (int) N;
        coins = (int) (N * 100 % 100);
        
        System.out.println("NOTAS:\n"+
               Banknotes(100) + " nota(s) de R$ 100.00\n" +
               Banknotes(50) + " nota(s) de R$ 50.00\n" +
                Banknotes(20) + " nota(s) de R$ 20.00\n" +
                Banknotes(10) + " nota(s) de R$ 10.00\n" +
                Banknotes(5) + " nota(s) de R$ 5.00\n" +
                Banknotes(2) + " nota(s) de R$ 2.00\n" +
                "MOEDAS:\n"+
               Banknotes(1) + " moeda(s) de R$ 1.00\n"+
                Coins(50) + " moeda(s) de R$ 0.50\n" +
                Coins(25) + " moeda(s) de R$ 0.25\n" +
                Coins(10) + " moeda(s) de R$ 0.10\n" +
                Coins(5) + " moeda(s) de R$ 0.05\n" +
                Coins(1) + " moeda(s) de R$ 0.01");
   }

    public  static int Banknotes(int banknote){
        int resultofBanknotes = 0;
        if(notes >= banknote) {
            resultofBanknotes = notes / banknote;
            notes %= banknote;
        }
        return resultofBanknotes;
    }
    public static int Coins(int coin){
        int resultofCoins = 0;
        if(coins >= coin) {
            resultofCoins = coins / coin;
            coins %= coin; 
        }
        return resultofCoins;
    }
}
