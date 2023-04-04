import java.util.Objects;

/**
 * @ClassName：Commodity
 * @description：
 * @date：2023-04-02 01:21
 */

public class Commodity {
    private int number;
    private String name;
    private double price;

    //重写equals


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return number == commodity.number && Double.compare(commodity.price, price) == 0 && Objects.equals(name, commodity.name);
    }

    @Override
    public String toString() {
        return
                "number=" + number +
                ", name='" + name + '\'' +
                ", price=" + price +"";
    }

    public Commodity() {
    }

    public Commodity(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
}
