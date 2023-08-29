import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = sc.nextFloat();

        float A = 0;
        float B = 0;
        float C = 0;

        if (x >= y && x >= z) {
            A = x;
            B = y;
            C = z;
        } else if (y >= x && y >= z) {
            A = y;
            B = x;
            C = z;
        } else {
            A = z;
            B = y;
            C = x;
        }

        double v = Math.pow(B, 2) + Math.pow(C, 2);
        if (A >= B + C) System.out.println("NAO FORMA TRIANGULO");
        else if (Math.pow(A,2) == v) System.out.println("TRIANGULO RETANGULO");
        else if (Math.pow(A,2) > v) System.out.println("TRIANGULO OBTUSANGULO");
        else if (Math.pow(A,2) < v) System.out.println("TRIANGULO ACUTANGULO");
        if (A == B && A == C && B == C) System.out.println("TRIANGULO EQUILATERO");
        else if ( A == B || A == C || B == C)System.out.println("TRIANGULO ISOSCELES");

        sc.close();
    }
}