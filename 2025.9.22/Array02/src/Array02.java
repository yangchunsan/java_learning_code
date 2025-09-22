import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {

//        double scores[] = new double[5];
        double scores[];
        scores = new double[5];
        Scanner myScanner = new Scanner(System.in);

        for(int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个元素的成绩");
            scores[i] = myScanner.nextDouble();
        }

        for(int i = 0; i < scores.length; i++) {
            System.out.print("输出第" + (i + 1) + "个元素的成绩");
            System.out.println(scores[i] + " ");
        }
    }
}