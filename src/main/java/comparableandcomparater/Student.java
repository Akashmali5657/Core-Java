package comparableandcomparater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
1. Comparable -
First we need to implement comparable interface into class and then we can override compareTo method and there we have
to specify according to which factor we want to sort. - it provide single way of sorting.

2. Comparator -
Directly inside the class we will create Anonymous class of comparator , then by using compare method we will sort code.
 */
class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    public int compareTo(Student st){
//        if(age==st.age)
//            return 0;
//        else if(age>st.age)
//            return 1;
//        else
//            return -1;
//    }

    //comparable interface compareTo method
    public int compareTo(Student st) {
        return this.rollno - st.rollno;
    }

// comparator interface compare method
    public static Comparator<Student> nameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

}