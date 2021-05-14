/*javac -d . *.java

java Passwords_Validator

*/


import java.util.Scanner;

public class Passwords_Validator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while( scanner.hasNextLine()){
	    String text = scanner.nextLine();

	boolean Uppercase = false;  
	boolean Lowercase = false; 
	boolean Numbers = false;
	

        for(int i = 0; i < text.length(); i ++){
	    if( Character.isDigit(text.charAt(i)) ){
		if(!Numbers)
		    Numbers = true;
		    continue;
	    } else if( text.charAt(i) >= 'a' && text.charAt(i) <= 'z'){
	        if(!Lowercase)
		    Lowercase = true;
		    continue;
	    } else if( text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'){
	        if(!Uppercase)
		   Uppercase = true;
		    continue;
	    } 
	}

	if(Uppercase && Lowercase && Numbers)
	    System.out.println("Senha valida.");
	else 
	    System.out.println("Senha invalida.");
        }
    }
}