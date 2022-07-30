package per.qxy.chapter02.interfaces.impl;

import per.qxy.chapter02.Apple;
import per.qxy.chapter02.interfaces.ApplePredicate;

/**
 * 通过实现接口达到对各种需求的满足，但还是比较冗余
 * 如果只为了使用一次反复的重新创建类，十分繁琐
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
