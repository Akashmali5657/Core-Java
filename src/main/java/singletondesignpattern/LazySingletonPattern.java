package singletondesignpattern;

public class LazySingletonPattern {
    private static LazySingletonPattern object= null;
    private LazySingletonPattern(){

    }
    public static LazySingletonPattern getInstance(){
        if(object==null){
            object = new LazySingletonPattern(); // at request time
        }
        return object;
    }

    public void sayHi(String name){
        System.out.println("Hi "+name);
    }
}
