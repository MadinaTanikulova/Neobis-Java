/*
 *javac -d . *.java
 *
 *java Sequence
 *
 */

public class Sequence {
    public static void main(String[] args) {
        int C = 0;
        for(float i = 0; i < 2.1; i += 0.2){
            for(int j = 1; j <= 3; j++)
            if (C % 5 == 0) {
                    System.out.printf("I=%.0f J=%.0f\n", i, j + i );   
            } else {                        
                    System.out.printf("I=%.1f J=%.1f\n", i, j + i);   
            }
            C++;
        }
    }
}
