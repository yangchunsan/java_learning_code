//1.引入 Scanner类所在的包
import java.util.Scanner;
//表示把java.util下的Scanner类（简单文本扫描器）导入

public class Input {
    public static void main(String[] args) {
        //演示接受用户的输入
        //2.创建 Scanner 对象，new 创建一个对象
        Scanner myScanner = new Scanner(System.in);

        //3.接受用户的输入
        System.out.println("请输入名字：");
        String name = myScanner.next(); //接受用户输入字符串
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt(); //接受用户输入整型变量
        System.out.println("请输入薪水：");
        double sla = myScanner.nextDouble();//接受用户输入浮点型变量
        System.out.println("名字：" + name + " 年龄：" + age + " 薪水：" + sla);
    }
}