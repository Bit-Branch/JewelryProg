package by.bsuir.german;

abstract class Product {
    private String title;
    private double weight;
    private double price;
    private Metal metal;


    public Product(String title, double weight, double price, Metal metal) {
        this.title = title;
        this.weight = weight;
        this.price = price;
        this.metal = metal;
    }

    public String getTitle() {
        return title;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
}
