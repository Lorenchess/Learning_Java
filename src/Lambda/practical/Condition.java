package Lambda.practical;
@FunctionalInterface
public interface Condition<T> {
    boolean test(T t);
}
