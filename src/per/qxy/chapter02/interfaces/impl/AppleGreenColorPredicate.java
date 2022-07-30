package per.qxy.chapter02.interfaces.impl;

import per.qxy.chapter02.Apple;
import per.qxy.chapter02.interfaces.ApplePredicate;

public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
