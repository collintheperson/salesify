package models;

import java.sql.Timestamp;

/**
 * Created by Guest on 8/23/17.
 */
public class AlcoholicBeverage implements Beverage {
    private String name;
    private double price;
    private Timestamp soldTime;
    private boolean sale;
    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlcoholicBeverage that = (AlcoholicBeverage) o;

        if (Double.compare(that.price, price) != 0) return false;
        if (sale != that.sale) return false;
        if (id != that.id) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (sale ? 1 : 0);
        result = 31 * result + id;
        return result;
    }

    public AlcoholicBeverage(String name, double price, boolean sale){
        this.name = name;
        this.price = price;
        this.sale = sale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Timestamp getSoldTime() {
        return soldTime;
    }

    public void setSoldTime(Timestamp soldTime) {
        this.soldTime = soldTime;
    }

    public boolean isSale() {
        return sale;
    }

    public void setSale(boolean sale) {
        this.sale = sale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
