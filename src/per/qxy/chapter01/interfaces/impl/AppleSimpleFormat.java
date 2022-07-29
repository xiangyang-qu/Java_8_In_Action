package per.qxy.chapter01.interfaces.impl;

import per.qxy.chapter01.Apple;
import per.qxy.chapter01.interfaces.AppleFormatter;

public class AppleSimpleFormat implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
//        int weight = apple.getWeight();
//        Integer parseToString = weight;
//        return parseToString.toString();

        return "An apple of " + apple.getWeight() + " g";
    }
}
