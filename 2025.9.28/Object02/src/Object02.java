public class Object02 {

    public static void main(String[] args) {

        Person jack = new Person();
        System.out.println(jack.age + jack.name + jack.gender + jack.sal + jack.isPass);
        System.out.println(jack.gender);
    }
}

class Car {
    protected String name;//访问修饰符
    double price;
    String color;
    String master[];//属性可以是基本数据类型，也可以是引用类型
}

class Person {
    int age;
    String name;
    char gender;
    double sal;
    boolean isPass;
}