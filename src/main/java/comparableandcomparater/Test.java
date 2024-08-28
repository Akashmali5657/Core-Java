package comparableandcomparater;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    //Creating a test class to sort the elements
    public static void main(String args[]) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

        // comparable interface
        Collections.sort(al);
        System.out.println("comparable interface output ");
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        //comparator interface
        System.out.println();
        Collections.sort(al,Student.nameComparator);
        System.out.println("comparator interface output ");
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

    }
}
