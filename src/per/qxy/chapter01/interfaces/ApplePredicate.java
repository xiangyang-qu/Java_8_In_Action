package per.qxy.chapter01.interfaces;

import per.qxy.chapter01.Apple;

/**
 * 参数化行为，通过接口来约束行为，将整个行为作为参数传入到方法中
 * 在方法中实现，行为的定制化，满足不同的需求
 * 这种方式跟策略设计模式相关
 */
public interface ApplePredicate {
    boolean test(Apple apple);
}
