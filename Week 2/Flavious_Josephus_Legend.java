
/*javac -d . *.java

java Flavious_Josephus_Legend

*/

import java.util.Scanner;

public class Flavious_Josephus_Legend {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
            for (int i = 1; i <= N; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                    int result =Result(x, y) + 1;
                    System.out.println("Case " + i + ": " +result);
                }
    }
    public static int Result(int x, int y) {
        int result = 0;

        for (int i = 2; i <= x; i++)
            result= (result + y) % i;

        return result; }
}