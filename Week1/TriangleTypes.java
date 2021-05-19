/*
 *javac -d . *.java
 *
 *java Triangle_Types
 *
 */

import java.util.Scanner;

public class TriangleTypes {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        if (C > A) {
            double temp;
            temp = A;
            A = C;
            C = temp;
	}
        if (B > A){
            double temp2;
            temp2 = A;
            A = B;
            B = temp2;
	}
            
        if (C > B){
            double temp4 = B;
            B = C;
            C = temp4;
	}

    
         if ( A >= (B + C)) {
		 System.out.println("NAO FORMA TRIANGULO");
	 } else if ( Math.pow(A,2) == ( Math.pow(B,2) + Math.pow(C,2))) { 
		 System.out.println("TRIANGULO RETANGULO");
	 } else if ( Math.pow(A,2) > ( Math.pow(B,2) + Math.pow(C,2))) {
		 System.out.println("TRIANGULO OBTUSANGULO");
	 } else  if ( Math.pow(A,2) < ( Math.pow(B,2) + Math.pow(C,2))) { 
		 System.out.println("TRIANGULO ACUTANGULO");
	 }
           
     if ((A==B) && (B==C) && (A==C)) {
	     System.out.println("TRIANGULO EQUILATERO");
     } else if ((A == B) || (A == C) || (B == C)) {
	     System.out.println("TRIANGULO ISOSCELES");
     }
   
   }
}
