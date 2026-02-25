package section4Exercises;

import java.util.Locale;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.println("Digite a raio do circulo");
        double raio = sc.nextDouble();

        double area = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f", area);
        
        sc.close();
    }
}
