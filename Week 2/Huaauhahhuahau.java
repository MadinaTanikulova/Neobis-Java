
/*javac -d . *.java

java Huaauhahhuahau

*/

import java.util.Scanner;

public class Huaauhahhuahau{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
	
	String text = scanner.nextLine();
	String result = "";
	for(int i = 0; i < text.length(); i++){
	switch (text.charAt(i)){
	case 'a': result += text.charAt(i);break;
		case 'e': result += text.charAt(i);break;
			case 'i': result += text.charAt(i);break;
				case 'o': result += text.charAt(i);break;
					case 'u': result += text.charAt(i);break;}}
	   
	boolean Funny = true;
	for(int i = 0, j =result.length() - 1; i < result.length() / 2; i++, j--)
	    if(result.charAt(i) != result.charAt(j)) {
	        Funny = false;  break; }
	        if (Funny)
	        System.out.println("S");
	        else
	        System.out.println("N");
	       
	                                             


    }
}