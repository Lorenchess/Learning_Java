package LambdasDemo;

//Very important example of Generics ...
@FunctionalInterface
public interface MyGenericInterface<T>{
    T work(T t);
}
