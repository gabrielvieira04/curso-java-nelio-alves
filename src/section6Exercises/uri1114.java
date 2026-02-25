package section6Exercises;

import java.util.Locale;
import java.util.Scanner;

public class uri1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int senha =sc.nextInt();

        while (senha != 2002){
            System.out.println("Senha invalida");
            senha = sc.nextInt();
        }
        
        System.out.println("Acesso permitido");

        sc.close();

    }

}
