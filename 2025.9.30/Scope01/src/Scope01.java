
public class Scope01 {
    public static void main(String[] args) {


    }
}

class Cat {

    int age = 10;
    //成员属性就是全局变量，作用域在整个类体Cat类

    //全局变量（属性）可以不赋值就可以直接使用，有默认值
    //局部变量必须赋值之后才能使用，没有默认值
    double weight;//默认值是0.0

    public void cry() {
        //1. 局部变量一般是指在成员方法中定义的变量
        //2. n和name就是局部变量
        //3. 作用域在cry方法里面
        int n = 10;
        String name = "jack";
        System.out.println("在cry中使用属性 age:" + age);
    }

    public void eat() {
        System.out.println("在eat中使用属性 age:" + age);
    }
}