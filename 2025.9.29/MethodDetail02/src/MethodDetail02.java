public class MethodDetail02 {

    public static void main(String[] args) {

        A a = new A();
        a.sayOk();
        a.m1();
    }
}

class A {
    //同一个类中的方法调用：直接调用即可
    public void print(int n) {
        System.out.println("print()方法被调用 n = " + n);
    }

    public void sayOk() {//这个方法调用print()方法
        print(10);
        System.out.println("继续执行sayOk()方法");
    }

    //跨类中的方法调用，A类调用B类方法：需要通过对象名调用
    public void m1() {
        System.out.println("m1()方法被调用");
        //先创建B对象，然后再调用方法
        B b = new B();
        b.hi();
        System.out.println("继续执行m1()方法");
    }
}


class B {

    public void hi() {
        System.out.println("B类中的hi()方法被执行");
    }
}