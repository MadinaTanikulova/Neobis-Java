/*
 *javac -d . *.java
 *
 *java PrimeNumber
 *
 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
	int N = scanner.nextInt();
	int []array =new int [N];
	for( int i = 0; i < N; i++){
	   array[i] = scanner.nextInt();
	}    
	for( int i = 0; i < N; i++){
	    if (Result(array[i]))
	    System.out.println(array[i]+" eh primo");
	    else
	     System.out.println(array[i]+" nao eh primo");
	}     
    }

    public static boolean Result(int number){
        int N = number / 2 + 1;
	if( number != 2 )
            for(int i = 2; i < N; i++)
    	        if(number % i == 0)
    	            return false;       
	return true;
	    
    }
}
