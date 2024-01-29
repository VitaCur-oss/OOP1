package org.example;

import java.util.ArrayList;
import java.util.List;

public class VendingHeatDrink implements Vending {
    private final List<HeatDrink> list;

    public VendingHeatDrink(){
        list = new ArrayList<>();
    }
    public void addProduct(Product product) {
        list.add((HeatDrink) product);
    }

    public Product getProduct(String name) {
        for (Product product : list) {
            if (name.equals(product.getKind())){
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String kind, Double price, Integer temp, Integer volume) {
        return null;
    }

    public HeatDrink getProduct(String name, Integer volume, Integer temp) {
        for (HeatDrink product : list) {
            if (name.equals(product.getKind())
                    && volume.equals(product.getVolume())
                    && temp.equals(product.getTemp()) ){
                return product;
            }
        }
        return null;
    }


}

    //Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
    // и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
    // выдающий продукт соответствующий имени, объёму и температуре















