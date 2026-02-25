package section5Exercises;

import java.util.Locale;
import java.util.Scanner;

public class uri1046 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horainicial = sc.nextInt();
        int horafinal = sc.nextInt();

        int duracao;
        if (horainicial < horafinal) {
            duracao = horafinal - horainicial;
        } else if (horainicial > horafinal) {
            duracao = 24 - horainicial + horafinal;
        } else {
            duracao = 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

        sc.close();
    }
}

