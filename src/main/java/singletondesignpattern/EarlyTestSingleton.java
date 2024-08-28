package singletondesignpattern;

public class EarlyTestSingleton {
    public static void main(String[] args) {
        EarlySingletonPattern object = EarlySingletonPattern.getInstance();
        object.sayHi("Akash");
    }
}
