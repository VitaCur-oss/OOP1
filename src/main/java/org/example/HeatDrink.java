package org.example;

public class HeatDrink extends Product{
    //. Создать наследника реализованного класса ГорячийНапиток
    // с дополнительным полем int температура.
    private Integer temp;
    private Integer volume;

    public HeatDrink(String kind, Double price, Integer temp, Integer volume){
        super(kind, price);
        this.temp = temp;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HeatDrink{" +
                "kind=" + getKind() +
                ", price=" + getPrice() +
                ", temp=" + temp +
                ", volume=" + volume +
                '}';
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
