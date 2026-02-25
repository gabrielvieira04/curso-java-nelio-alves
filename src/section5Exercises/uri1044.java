package section5Exercises;

import java.util.Locale;
import java.util.Scanner;

public class uri1044 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 > n2){
            if (n1 % n2 == 0){
                System.out.println("SÃO MULTIPLOS");
            } else {
                System.out.println("NÃO MULTIPLOS");
            }
        } else if (n2 > n1){
            if (n2 % n1 == 0){
                System.out.println("SÃO MULTIPLOS");
            } else {
                System.out.println("NÃO MULTIPLOS");
            }
        }

        sc.close();
    }
}
