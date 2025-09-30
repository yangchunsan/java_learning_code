
public class VarParameterDetail {
    public static void main(String[] args) {


        //可变参数的实参可以是数组
        int arr[] = {1, 2, 4};
        T t1 = new T();
        t1.f1(arr);
    }
}

class T {

    public void f1(int... nums) {
        System.out.println("长度：" + nums.length);
    }

    //可变参数可以和普通类型的参数一起放在形参列表，但是必须保证可变参数放在最后
    public void f2(String str, double... nums) {

    }

    //一个形参列表中最多只能有一个可变参数！！！
}