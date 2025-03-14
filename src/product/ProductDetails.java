package product;

import java.util.Scanner;

public class ProductDetails {
    public static void main(String[] args) {
        // tao ban sao cua class 1 product
        Product pTest = new Product();

        // goi lai method
        Product p1 = pTest.inputInformation("Coc", 10000, 0.1);
        pTest.showInformation(p1);

    }
}
