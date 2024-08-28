package singletondesignpattern;

public class LazyTestSingleton {
    public static void main(String[] args) {
        LazySingletonPattern object = LazySingletonPattern.getInstance();
        object.sayHi("Akash");

    }
}
