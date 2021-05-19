/*
 *javac -d . *.java
 *
 *java Combiner
 *
 */

import java.util.Scanner;

public class Combiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	int N = Integer.parseInt(scanner.nextLine());	
	    for (int k=N;k>0;k--){
	    String[] array = scanner.nextLine().split(" ");
	    String result = "";	    
	    String Ltext=null;
		    
	   if (array[0].length() > array[1].length()) {
	    Ltext= array[0]; 
	   } else {
	     Ltext=array[1];
	   }
	    int Shorttext =0;
	    if (array[0].length() < array[1].length()){ 
	    Shorttext=array[0].length();
	    } else {
	    Shorttext=array[1].length();
	    }
	    
	    for(int i = 0 ; i < Shorttext; i++)
		result = result + array[0].charAt(i) + array[1].charAt(i);
	    result +=Ltext.substring(Shorttext);
	    System.out.println(result);     
	    }
    } 
}
