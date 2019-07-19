package pl.homework.util;

import pl.homework.lib.Product;

import java.util.Scanner;

public class UserInterface {
    public Product getProduct() {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dane produktu :");
        System.out.println(" - nazwa: ");
        product.setName(scanner.nextLine());
        System.out.println(" - opis: ");
        product.setDescription(scanner.nextLine());
        System.out.println(" - cena netto: ");
        product.setNettoPrice(scanner.nextDouble());
        scanner.nextLine();
        System.out.println(" - kategoria: ");
        product.setCategory(scanner.nextLine());
        return product;
    }
}
