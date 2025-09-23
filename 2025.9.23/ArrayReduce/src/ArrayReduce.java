//数组缩减，每次缩减最后一个元素
import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};//初数组

        Scanner myScanner = new Scanner(System.in);//创建扫描器

        char choice;//储存y/n
        int count = 0;

        //先输入再判断，所以用dowhile循环
        do {
            int len = arr.length;//初数组的长度
            int arrNew[] = new int[len - 1];//创建新数组，比原数组小一

            //将原数组一一赋值到新数组
            for(int i = 0; i < len - 1; i++) {
                arrNew[i] = arr[i];
            }

            //将新数组的地址赋值给原数组，从而实现原数组缩减
            arr = arrNew;

            count++;//计数器

            //询问用户意见
            System.out.println("现在已经缩减第" + count + "次");

            if(arr.length == 1) {
                System.out.println("数组只剩一个元素，功能停止");
                break;
            }
            System.out.println("是否继续缩减：y/n");
            choice = myScanner.next().charAt(0);
        }while(choice == 'y');
        //如果用户选择了y，其实现在的arr已经和刚创建时候的arr不一样了，因为已经实现了数组缩减
        //当重新进入do-while循环的时候，又是重新开始缩减的过程，从而达成目标

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}