//import java.util.Scanner;
//
//public class Homework01 {
//    public static void main(String[] args) {
//        int arr[] = {10, 12, 45, 90};//原数组
//
//        Scanner myScanner = new Scanner(System.in);
//
//        //接下来进行数组扩容
//        int newArr[] = new int[arr.length + 1];
//
//        for(int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[i];
//        }
//
//        System.out.println("请输入想要扩容的元素：");
//        newArr[arr.length] = myScanner.nextInt();
//
//        //引用赋值
//        arr = newArr;
//
//        //冒泡排序，升序
//        for(int i = 0; i < arr.length - 1; i++) {
//            for(int leftIndex = 0; leftIndex < arr.length - 1 -i; leftIndex++) {
//                int rightIndex = leftIndex + 1;
//
//                if(arr[leftIndex] > arr[rightIndex]) {
//                    int temp = arr[leftIndex];
//                    arr[leftIndex] = arr[rightIndex];
//                    arr[rightIndex] = temp;
//                }
//            }
//        }
//
//        //打印新数组
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        int arr[] = {10, 12, 45, 90};//原数组

        Scanner myScanner = new Scanner(System.in);

        //接下来进行数组扩容
        int newArr[] = new int[arr.length + 1];

        System.out.println("请输入想要扩容的元素：");
        int cut = myScanner.nextInt();//插入的元素


        //分类
        //1.在前面或者中间
        for(int i = 0; i < arr.length - 1; i++) {
            if(cut >= arr[i] && cut <= arr[i + 1]) {
                newArr[i] = arr[i];
                newArr[i + 1] = cut;
                for(int j = i + 2; j < newArr.length; j++) {
                    newArr[j] = arr[i + 1];
                    i++;
                }
                arr = newArr;
                break;
            }
            newArr[i] = arr[i];
        }

        //2.在最后面
        if(cut > arr[arr.length - 1]) {
            newArr[newArr.length - 1] = cut;

            for(int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }

            arr = newArr;
        }

        //打印新数组
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}