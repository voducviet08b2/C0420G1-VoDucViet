package Compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Student implements Comparable<Student> {
    public String name;
    public int age;
    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return this.name+"-"+this.age;
    }
    @Override
    public int compareTo(Student o) {
    return this.age-o.age;
    }
    public static void main(String[] args) {
        Student student1=new Student("Long",24);
        Student student2=new Student("Viet",50);
        Student student3=new Student("Bong",30);
        Student student4=new Student("Aiong",30);
        ArrayList<Student> listStudent=new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        Collections.sort(listStudent,new sortNameAge());
       // Collections.sort(listStudent,new sortByName());
        System.out.println(listStudent);
    }

    
}
