/*
 *javac -d . *.java
 *
 *java Fibonacci
 *
 */

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();    
        int []array =new int [N];
        for(int i = 0;  i < N; i++) {
             array[i] = scanner.nextInt();
              System.out.printf("Fib(%d) = %d%n", array[i], Fibo(array[i]));
	}

    }

    public static long  Fibo(int number){
        if (number == 0)
            return 0;
        else{
            long array1 = 0;
            long array2 = 1;
            for (int i = 2; i <= number; i++) {
                long result = array1 + array2;
                array1  = array2;
                array2 = result;
            }
            return array2;
        }
    }
}
