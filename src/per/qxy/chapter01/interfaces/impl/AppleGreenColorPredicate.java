package per.qxy.chapter01.interfaces.impl;

import per.qxy.chapter01.Apple;
import per.qxy.chapter01.interfaces.ApplePredicate;

public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
