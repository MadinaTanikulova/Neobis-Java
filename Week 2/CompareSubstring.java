/*
 *javac -d . *.java
 *
 *java CompareSubstring
 */

import java.util.Scanner;

public class CompareSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  max, min;

        while (sc.hasNextLine()) {
           String text1 = sc.nextLine();
            String text2 = sc.nextLine();

            if (text1.length() >= text2.length()) {
                max = text1;
                min = text2;
            } else {
                max = text2;
                min = text1;
            }
            
            int maxL = min.length();
            boolean f = true;

            while (maxL > 0 && f) {
                int diff = min.length() - maxL;

                for (int i = 0; i <= diff; i++) {
                    if (max.contains(min.substring(i, i + maxL))) {
                        f = false;
                        maxL++;
                        break; }}
                maxL--;
            }
            System.out.println(maxL);
        }
    }
}
