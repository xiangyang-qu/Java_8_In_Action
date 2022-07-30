package per.qxy.chapter02.interfaces.impl;

import per.qxy.chapter02.Apple;
import per.qxy.chapter02.interfaces.AppleFormatter;

public class AppleSimpleFormat implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
//        int weight = apple.getWeight();
//        Integer parseToString = weight;
//        return parseToString.toString();

        return "An apple of " + apple.getWeight() + " g";
    }
}
