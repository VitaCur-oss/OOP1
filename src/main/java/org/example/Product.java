package org.example;

public abstract class Product {
    private String kind;
    private Double price;


    public Product(String kind, Double price) {
        this.kind = kind;
        this.price = price;

    }

    public String getKind() {
        return kind;
    }

    public void setKind(String name) {
        this.kind = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


}
