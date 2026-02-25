package section10Exercises;
import java.util.Scanner;
import section10Exercises.entities.Rent;

public class RoomsRented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] roomsRented = new Rent[10];
        

        System.out.println("Quantos quartos irao ser preenchidos ? [MAX = 10]");
        int n = Integer.parseInt(sc.nextLine());
        

        for (int i = 1; i <= n; i++){
            System.out.println("Informe nome, email, e quarto desejado");
            String name = sc.nextLine();
            String email = sc.nextLine();
            int nquarto;

            do {
                System.out.println("Numero do quarto [1 - 10]");
                nquarto = Integer.parseInt(sc.nextLine());
                if (nquarto < 1 || nquarto > 10) {
                    System.out.println("Numero do quarto invalido, [1 - 10]");
                }
            } while (nquarto < 1 || nquarto > 10);
            
            roomsRented[nquarto-1] = new Rent(name, email);

        }
        
        System.out.println("Quartos Preenchidos: ");

        for (int j = 0; j < roomsRented.length; j++){
            if (roomsRented[j] != null) {
                System.out.printf("Quarto [%d], %s \n", j + 1, roomsRented[j]);
            }
        }
        sc.close();
    }

}
