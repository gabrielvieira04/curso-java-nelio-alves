package section4Exercises;

import java.util.Locale;
import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        int diferenca = (n1 * n2) - (n3 * n4);

        System.out.println("Diferenca = " + diferenca);
        
        sc.close();
    }
}
