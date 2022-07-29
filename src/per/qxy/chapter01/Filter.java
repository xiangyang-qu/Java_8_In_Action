package per.qxy.chapter01;


import per.qxy.chapter01.interfaces.Predicate;

import java.util.ArrayList;
import java.util.List;

/**
 * 参数化行为 + 参数化类型 进行方法的高度抽象提高代码的复用性
 */
public class Filter {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            integers.add(i);
        }

        List<Integer> evenNumbers = filter(integers, (Integer i) -> i % 2 == 0);
        evenNumbers.forEach(System.out::println);
        System.out.println();

        List<Apple> finalAppleList = filter(Apple.getInventory(), (Apple apple) -> "green".equals(apple.getColor()));
        finalAppleList.forEach(System.out::println);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
