//数组扩容
import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};//初数组

        Scanner myScanner = new Scanner(System.in);//创建扫描器

        char choice;//储存y/n

        //先输入再判断，所以用dowhile循环
        do {
            int len = arr.length;//初数组的长度
            int arrNew[] = new int[len + 1];//创建新数组，比原数组大一

            //将原数组一一赋值到新数组
            for(int i = 0; i < len; i++) {
                arrNew[i] = arr[i];
            }

            //添加新数字
            System.out.println("请添加一个数字：");
            arrNew[len] = myScanner.nextInt();

            //将新数组的地址赋值给原数组，从而实现原数组扩容
            arr = arrNew;

            //询问用户意见
            System.out.println("是否继续添加：y/n");
            choice = myScanner.next().charAt(0);
        }while(choice == 'y');
        //如果用户选择了y，其实现在的arr已经和刚创建时候的arr不一样了，因为已经实现了数组扩容
        //当重新进入do-while循环的时候，又是重新开始扩容的过程，从而达成目标

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}