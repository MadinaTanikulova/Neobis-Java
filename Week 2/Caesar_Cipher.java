/*javac -d . *.java

java Caesar_Cipher

*/

import java.util.Scanner;


public class Caesar_Cipher{
    public static void main( String[] args ) {
	Scanner scanner = new Scanner(System.in);

	int N = Integer.parseInt( scanner.nextLine() );
	
	    for (int k=N;k>0;k--){
	    String text = scanner.nextLine();
  	    int  p = Integer.parseInt(scanner.nextLine());
	    String result = "";                           

	    for(int i = 0; i < text.length(); i++){
		if('A' <= text.charAt(i) - p)
	            result += (char) (text.charAt(i) - p);
		else
	           result += (char) (('Z' - ('A' -  (text.charAt(i) - p))) + 1);       } 		      	           
	    System.out.println(result);
	}

    }}
