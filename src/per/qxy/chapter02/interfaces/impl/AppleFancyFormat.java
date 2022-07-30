package per.qxy.chapter02.interfaces.impl;

import per.qxy.chapter02.Apple;
import per.qxy.chapter02.interfaces.AppleFormatter;

public class AppleFancyFormat implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
//        String s = apple.toString();
//        String s1;
//        if (apple.getWeight() > 150) {
//            s1 = "heavy";
//        } else {
//            s1 = "light";
//        }
//        return s + " " + s1;

        //better way
        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + characteristic + " " + apple.getColor() + " apple";
    }
}
