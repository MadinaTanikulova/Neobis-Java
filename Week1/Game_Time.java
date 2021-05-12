/*javac -d . *.java

java Game_Time

*/



import java.util.Scanner; 

public class Game_Time{
   public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	String input = scanner.nextLine();
	String[] array = input.split(" ");

	int startHour = Integer.parseInt(array[0]);
	int startMinute = Integer.parseInt(array[1]);
	int endHour = Integer.parseInt(array[2]);
	int endMinute = Integer.parseInt(array[3]);

	if(endMinute < startMinute){
	    endHour--;
	    endMinute += 60;
	}	
	int resultMinute = endMinute - startMinute;
	
	if(endHour < startHour || (endHour == startHour && resultMinute < 1))
	    endHour += 24;                     
	int resultHour = endHour - startHour;                                                 

	System.out.println("O JOGO DUROU " + resultHour + " HORA(S) E " + resultMinute + " MINUTO(S)");    
    }
}