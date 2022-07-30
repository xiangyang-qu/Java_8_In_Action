package per.qxy.chapter02.interfaces.impl;

import per.qxy.chapter02.Apple;
import per.qxy.chapter02.interfaces.ApplePredicate;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
