//判断是不是水仙花数

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("请输入一个数字：");
        int number = myScanner.nextInt();

        int num3 = number % 10;//个位数
        int num2 = number % 10 / 10;//十位数
        int num1 = number / 100;

        if (number == num3*num3*num3 + num2*num2*num2 + num1*num1*num1) {
            System.out.println("是水仙花数");
        }else {
            System.out.println("不是水仙花数");
        }
    }
}

