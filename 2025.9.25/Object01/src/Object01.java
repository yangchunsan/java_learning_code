public class Object01 {
    public static void main(String[] args) {

        //使用oop面向对象
        //实例化一只猫（创建一只猫）
        Cat cat1 = new Cat();
        //new Cat(); 创建一只猫
        //Cat cat1 = new Cat(); 把创建的猫赋值给cat1
        //初始化
        cat1.name = "小白";
        cat1.age = 8;
        cat1.color = "black";
    }
}


//定义一个猫类，自定义的数据类型
class Cat {
    //成员变量（属性）field
    String name;
    int age;
    String color;

}