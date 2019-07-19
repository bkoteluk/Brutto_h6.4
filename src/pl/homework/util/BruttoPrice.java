package pl.homework.util;

import pl.homework.lib.Product;

public class BruttoPrice {

    public double bruttoPrice(Product product) {
        double result;
        switch (product.getCategory()) {
            case "owoce" :
                result = product.getNettoPrice()*1.08;
                break;
            case "tools" :
                result = product.getNettoPrice()*1.23;
                break;
            case "books" :
                result = product.getNettoPrice()*1.05;
                break;
                default:
                    result = product.getNettoPrice()*1.07;
        }
        return result;
    }

}
