package per.qxy.chapter02;


import per.qxy.chapter02.interfaces.AppleFormatter;
import per.qxy.chapter02.interfaces.ApplePredicate;
import per.qxy.chapter02.interfaces.impl.AppleFancyFormat;
import per.qxy.chapter02.interfaces.impl.AppleGreenColorPredicate;
import per.qxy.chapter02.interfaces.impl.AppleRedAndHeavyPredicate;
import per.qxy.chapter02.interfaces.impl.AppleSimpleFormat;
import java.util.ArrayList;
import java.util.Comparator;
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

        System.out.println("通过参数化行为，对苹果进行筛选");
        List<Apple> appleList = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println("筛选绿苹果");
        appleList.forEach(System.out::println);
        System.out.println();
        List<Apple> redAndHeavyApples = filterApples(inventory, new AppleRedAndHeavyPredicate());
        System.out.println("筛选红色的重苹果");
        redAndHeavyApples.forEach(System.out::println);
        System.out.println();

        System.out.println("定制化输出");
        prettyPrintApple(inventory, new AppleFancyFormat());
        prettyPrintApple(inventory, new AppleSimpleFormat());
        System.out.println();

        //匿名内部类实现ApplePredicate对象
        System.out.println("匿名内部类对接口实现，不创建新的 class 但是在代码中还是十分冗余");
        List<Apple> redApples1 = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        redApples1.forEach(System.out::println);
        System.out.println();

        System.out.println("lambda 表达式实现对接口的实现，直接参数化行为（代码块）");
        List<Apple> finalAppleList = filterApples(inventory, (Apple apple) -> "green".equals(apple.getColor()));
        finalAppleList.forEach(System.out::println);



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


    /**
     * 通过参数化行为进行筛选。
     * @param inventory
     * @param predicate
     * @return
     */
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * 参数化行为练习
     */
    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter appleFormatter) {
        for (Apple apple : inventory) {
            String out = appleFormatter.accept(apple);
            System.out.println(out);
        }
    }

}
