/*javac -d . *.java

java Weighted_Averages

*/

import java.util.Scanner;

public class Weighted_Averages{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

      int  N = Integer.parseInt(scanner.nextLine());
      float result=0.0f;
	for(int i = 0; i < N; i ++){
	    String[] array = scanner.nextLine().split(" ");
	     result= ((Float.parseFloat(array[0]) * 2)/10)+(( Float.parseFloat(array[1]) * 3)/10)+((Float.parseFloat(array[2]) * 5)/10);
	    System.out.printf("%.1f\n", result);     	    
	}  
}}
