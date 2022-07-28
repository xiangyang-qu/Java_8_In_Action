package per.qxy.chapter01;


import java.util.ArrayList;
import java.util.List;

public class FilterApple {

    public static void main(String[] args) {
        List<Apple> inventory = Apple.getInventory();

        System.out.println("筛选绿苹果");
        List<Apple> greenApples = filterGreenApple(inventory);
        greenApples.forEach(System.out::println);
        System.out.println();

        System.out.println("根据颜色筛选出，红苹果");
        List<Apple> redApples = filterApplesByColor(inventory, "red");
        redApples.forEach(System.out::println);
        System.out.println();

        System.out.println("筛选出重苹果");
        List<Apple> weightApples = filterApplesByWeight(inventory, 150);
        weightApples.forEach(System.out::println);
        System.out.println();

        System.out.println("根据重量和颜色两个条件，筛选绿苹果");
        List<Apple> green = filterApples(inventory, "green", 0, true);
        green.forEach(System.out::println);
        System.out.println();

        System.out.println("根据重量和颜色两个条件，筛选出重苹果");
        List<Apple> apples = filterApples(inventory, "", 150, false);
        apples.forEach(System.out::println);
        System.out.println();

        
    }


    /**
     * filter green apple
     * @param inventory
     * @return green apples
     */
    public static List<Apple> filterGreenApple(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * filter apple by color
     * @param inventory
     * @param color
     * @return apples with color you pick
     */
    public static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * filter by weight
     * @param inventory
     * @param weight
     * @return apples weight > weight
     */
    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * filter apples by all attributes
     * @param inventory
     * @param color
     * @param weight
     * @param flag
     * @return
     */
    public static List<Apple> filterApples(List<Apple> inventory, String color, int weight, boolean flag) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ((flag && apple.getColor().equals(color)) || (!flag && apple.getWeight() > weight)) {
                result.add(apple);
            }
        }
        return result;
    }
}
