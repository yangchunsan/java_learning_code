/*以从小到大排序的数组为例
假设这个数组有n个元素，那么就需要确定n-1个元素的位置就能确保成功排序
第一轮排序是找出最大一个数放在数组末尾
第二轮排序是找出第二大的一个数放在数组倒数第二的位置
…………以此类推
具体的原理是从第一个元素开始，与隔壁进行比较
如果符合排序规则，则从第二个元素开始，与隔壁进行比较
如果不符合排序规则，则两者交换位置之后，从第二个元素开始，与隔壁进行比较
…………以此类推
每一轮确定一个数的位置之后，需要比较的数的数量就减一
 */

//public class BubbleSort {
//    public static void main(String[] args) {
//        int arr[] = {24, 69, 80, 57,13, 100, 9343, 1};//创建一个无序数组
//        int len = arr.length;//数组长度
//        int count = len - 1;//需要排序的次数
//
//        for(int i = 0; i < count; i++) {//第一层循环是控制排列的轮数
//
//            //第二层循环是控制元素的位置
//            for(int leftIndex = 0; leftIndex < count - i; leftIndex++) {//i轮之后，需要右移的次数少i次
//                int rightIndex = leftIndex + 1;//确定左右指针
//
//                if(arr[leftIndex] > arr[rightIndex]) {//不符合排序规则，交换数字
//                    int temp = arr[leftIndex];
//                    arr[leftIndex] = arr[rightIndex];
//                    arr[rightIndex] = temp;
//                }
//            }
//        }
//
//        //打印数组元素
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//    }
//}

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {24, 69, 80, 57,13, 100, 9343, 1};//创建一个无序数组
        int len = arr.length;//数组长度
        int count = len - 1;//需要排序的次数

        for(int i = 0; i < count; i++) {//第一层循环是控制排列的轮数

            //第二层循环是控制元素的位置
            for(int leftIndex = 0; leftIndex < count - i; leftIndex++) {//i轮之后，需要右移的次数少i次
                int rightIndex = leftIndex + 1;//确定左右指针

                if(arr[leftIndex] > arr[rightIndex]) {//不符合排序规则，交换数字
                    int temp = arr[leftIndex];
                    arr[leftIndex] = arr[rightIndex];
                    arr[rightIndex] = temp;
                }
            }
        }

        //打印数组元素
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}