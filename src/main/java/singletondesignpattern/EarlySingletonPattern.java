package singletondesignpattern;

public class EarlySingletonPattern {
    private static EarlySingletonPattern object= new EarlySingletonPattern(); //at load time
    private EarlySingletonPattern(){

    }
    public static EarlySingletonPattern getInstance(){
        return object;
    }

    public void sayHi(String name){
        System.out.println("Hi "+name);
    }
}
