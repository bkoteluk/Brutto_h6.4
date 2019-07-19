package pl.homework.lib;

public class Product {
    private String name;
    private String description;
    private double nettoPrice;
    private String category;

    public Product() {
    }

    public Product(String name, String description, double nettoPrice, String category) {
        this.name = name;
        this.description = description;
        this.nettoPrice = nettoPrice;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getNettoPrice() {
        return nettoPrice;
    }

    public void setNettoPrice(double nettoPrice) {
        this.nettoPrice = nettoPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Produkt " + name + " " + description + " cena netto: " + nettoPrice + " " + category;
    }

}
