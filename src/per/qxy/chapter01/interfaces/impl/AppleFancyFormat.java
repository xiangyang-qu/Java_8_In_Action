package per.qxy.chapter01.interfaces.impl;

import per.qxy.chapter01.Apple;
import per.qxy.chapter01.interfaces.AppleFormatter;

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
