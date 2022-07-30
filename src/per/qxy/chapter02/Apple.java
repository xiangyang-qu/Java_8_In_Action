package per.qxy.chapter02;



import java.util.ArrayList;
import java.util.List;

public class Apple {
    String color;
    int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static List<Apple> getInventory() {
        Apple green = new Apple("green", 120);
        Apple green1 = new Apple("green", 152);
        Apple red = new Apple("red", 123);
        Apple red1 = new Apple("red", 153);
        List<Apple> inventory = new ArrayList<>();
        inventory.add(green1);
        inventory.add(red1);
        inventory.add(green);
        inventory.add(red);
        return inventory;
    }
}
