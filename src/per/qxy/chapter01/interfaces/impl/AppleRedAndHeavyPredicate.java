package per.qxy.chapter01.interfaces.impl;

import per.qxy.chapter01.Apple;
import per.qxy.chapter01.interfaces.ApplePredicate;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
