package section13Exercises;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import section13Exercises.model.ImportedProduct;
import section13Exercises.model.Product;
import section13Exercises.model.UsedProduct;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Product #%d data:%n", i);
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = Character.toLowerCase(sc.next().charAt(0));
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                productList.add(new ImportedProduct(name, price, customsFee));
            } else if (type == 'u') {
                sc.nextLine();
                System.out.print("Manufacture date (dd/MM/yyyy): ");
                String manufactureDateText = sc.nextLine();
                LocalDate manufactureDate = LocalDate.parse(manufactureDateText, fmt);
                productList.add(new UsedProduct(name, price, manufactureDate));
            } else {
                productList.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : productList) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }

}
