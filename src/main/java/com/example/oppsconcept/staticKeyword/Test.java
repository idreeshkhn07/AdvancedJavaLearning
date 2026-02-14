package com.example.oppsconcept.staticKeyword;

public class Test {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setAge(12); student1.setId(123); student1.setName("Ramu");
        System.out.println(student1.getAge());
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student.getCount();
//        System.out.println(Student.count);

        System.out.println(Utils.max(5, 10));
        System.out.println(Utils.min(5, 10));
        System.out.println(Utils.trimAndUppercase("idreeshkhanMohammad"));
    }
}
