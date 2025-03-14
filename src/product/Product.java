package product;

public class Product {
    private String name;
    private double price;
    private double tax;

    // constructor
    public Product() {

    }
    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public double getTax() {
        return this.tax;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }

    public Product inputInformation(String name, double price, double tax) {
    Product pr = new Product(name, price, tax);
    return pr;
    }
    public void showInformation(Product product) {
        System.out.println("Ten san pham: " + product.getName() + ", Gia san pham la: " + product.getPrice() + ", thue cua san pham la: " + product.getTax());
    }


}
