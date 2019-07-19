package pl.homework.app;

import pl.homework.lib.Product;
import pl.homework.util.BruttoPrice;
import pl.homework.util.UserInterface;

public class ProductsTest {
    public static void main(String[] args) {

        UserInterface ui = new UserInterface();
        Product product1 = ui.getProduct();
        Product product2 = ui.getProduct();

        BruttoPrice bruttoPrice = new BruttoPrice();

        System.out.println(product1.toString() + " cena brutto : " + bruttoPrice.bruttoPrice(product1));
        System.out.println(product2.toString() + " cena brutto : " + bruttoPrice.bruttoPrice(product2));


    }
}
