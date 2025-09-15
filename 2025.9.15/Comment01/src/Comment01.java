//演示注释使用

public class Comment01{

    //编写一个main方法
    public static void main(string[] args){

        //单行注释

        //被注释的文字不会被JVM（java虚拟机）解释执行
        /* 示意->可读性很好
        下面代码功能实现两个数相加*/
        int n1 = 10;
        int n2 = 30;
        //求和
        int sum = n1 + n2;
        //输出结果
        System.out.println("结果：" + sum);
    }
}