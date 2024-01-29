package org.example;

public class sem1 {
    public static void main(String[] args) {


      Vending vending = new VendingHeatDrink();

      Product product1 = new Milk("Milk",55D , 55, 700);
      Product product3 = new Tea("Tea",20D , 65, 300);
      Product product2 = new Kofee("Kofee",70D , 80, 500);
      vending.addProduct(product1);
      vending.addProduct(product3);
      vending.addProduct(product2);
      System.out.println(vending.getProduct("Milk"));
      System.out.println(vending.getProduct("Kofee"));
      System.out.println(vending.getProduct("Tea"));
      System.out.println(vending.getProduct("Tea"));
    }

}
