package cn.itcast.extendstest;

/**
 * Student class
 *
 * @author 李茂林
 * @date 2018/8/12
 */
class Person{
    String name;
    int age;

}

public class Student extends Person{

//    String name;
//    int age;
    void study(){
        System.out.println("student study!");
    }

}
class Worker extends Person{
//    String name;
//    int age;
    void work(){
        System.out.println("worker work");
    }
}
class ExtendsDemo{
    public static void main(String[] args) {
        Student s = new Student();
        s.name="张三";
        s.age=16;
        s.study();
    }
}
