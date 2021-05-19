/*
 *javac -d . *.java
 *
 *java PerfectNumber
 *
 */

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
	int N = scanner.nextInt();
	int[] array = new int [N];
	for( int i = 0; i < N; i++){
	   array[i] = scanner.nextInt();
	}    
	for( int i = 0; i < N; i++){
	    if (Result(array[i]))
	    System.out.println(array[i]+" eh perfeito");
	    else
	     System.out.println(array[i]+" nao eh perfeito");
	}     
    }

    public static boolean Result(int number){
        int result = 0;
	    for(int i = 1; i < number; i++){
		result += i;
	    	if(result == number)
		    return true;
	    }
	      return false;
	    
    }
}
