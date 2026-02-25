package section4Exercises;
import java.util.Locale;
import java.util.Scanner;

public class CalculoPecas {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cPecas1 = sc.nextInt();
        int qPecas1 = sc.nextInt();
        double vPecas1 = sc.nextDouble();

        int cPecas2 = sc.nextInt();
        int qPecas2 = sc.nextInt();
        double vPecas2 = sc.nextDouble();

        double valorAPagar = (qPecas1 * vPecas1) + (qPecas2 * vPecas2);

        System.out.printf("Valor a pagar R$ %.2f", valorAPagar);

        sc.close();
    }
}
