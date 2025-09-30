
public class VarScopeDetail {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.say();
    }
}

class Person {
    String name;

    public void say() {
        //细节 属性和局部变量可以重名，访问时遵循就近原则
        String name = "king";
        System.out.println("say()name = " + name);
    }

    public void hi() {
        //在同一个作用域中，局部变量不能重名
        String address = "beijing";
//        String address = "shanghai";
    }
}