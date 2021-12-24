package LambdasDemo;

@FunctionalInterface
public interface CalculateInterface {
    int compute(int a, int b); //The method signature has to match the Lambda expression signature, if we need
    // arguments we need to included here in the abstract method
}
