public class MethodExercise02 {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 10;
        p.name = "jack";

        MyTools tools = new MyTools();
        Person newPerson = tools.copyPerson(p); // 直接接收拷贝对象

        // 验证拷贝结果
        System.out.println("原始对象: " + p.name + ", " + p.age);
        System.out.println("拷贝对象: " + newPerson.name + ", " + newPerson.age);
        System.out.println("是否为同一对象: " + (p == newPerson)); // 应输出false
    }
}

class Person {
    String name;
    int age;
}

class MyTools {
    public Person copyPerson(Person p) {
        Person newPerson = new Person(); // 在方法内创建新对象
        newPerson.age = p.age;
        newPerson.name = p.name; // String是引用类型但不可变，所以安全
        return newPerson;
    }
}
