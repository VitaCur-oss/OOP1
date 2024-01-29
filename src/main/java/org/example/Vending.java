package org.example;

public interface Vending {
    void addProduct(Product product);
    Product getProduct(String kind);
    Product getProduct(String kind, Double price, Integer temp, Integer volume);


}
