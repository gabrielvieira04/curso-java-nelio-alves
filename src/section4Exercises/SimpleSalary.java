package section4Exercises;

import java.util.Locale;
import java.util.Scanner;

public class SimpleSalary {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int workerId = sc.nextInt();
        int perHour = sc.nextInt();
        double workedHours = sc.nextDouble();

        System.out.println("Number = " +workerId);
        System.out.printf("Salary = $%.2f", perHour*workedHours);

        sc.close();
    }
}
