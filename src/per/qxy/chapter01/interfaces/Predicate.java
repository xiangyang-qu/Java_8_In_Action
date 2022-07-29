package per.qxy.chapter01.interfaces;


/**
 * 参数化类型 + 参数化行为提高代码的复用性
 * @param <T>
 */
public interface Predicate<T> {
    boolean test(T t);
}
