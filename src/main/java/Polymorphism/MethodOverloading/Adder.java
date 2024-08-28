package Polymorphism.MethodOverloading;

public class Adder {
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Adder rv= new Adder();
        rv.add(5,5);
        rv.add(5,5,5);
    }

}
