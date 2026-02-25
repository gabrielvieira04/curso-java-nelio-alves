package section4Exercises;

import java.util.Locale;
import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Insira o primeiro valor: ");
        float num1 = sc.nextFloat();
        System.out.print("Insira o segundo valor: ");
        float num2 = sc.nextFloat();

        float sum = num1 + num2;
        System.out.printf("A soma dos valores é = %.2f", sum);

        sc.close();
    }
}
