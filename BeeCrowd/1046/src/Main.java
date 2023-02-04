import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hInicial = 0, hFinal = 0;

        hInicial = sc.nextInt();
        hFinal = sc.nextInt();

        if (hInicial + hFinal == 0) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }else if (hInicial < hFinal) {
            hFinal = hFinal - hInicial;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", hFinal);
        } else {
            hFinal = 24 - hInicial + hFinal;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", hFinal);
        }
        sc.close();
    }
}