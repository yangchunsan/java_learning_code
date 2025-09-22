import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = myScanner.nextInt();

        if(number > 0) {
            System.out.println("正数");
        }else if(number == 0) {
            System.out.println("0");
        }else {
            System.out.println("负数");
        }
    }
}