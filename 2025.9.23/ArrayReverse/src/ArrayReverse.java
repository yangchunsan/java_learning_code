//public class ArrayReverse {
//    public static void main(String[] args) {
//        int arr[] = {11, 22, 33, 44, 55, 66};
//
//        for(int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//
//
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

public class ArrayReverse {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33, 44, 55, 66};
        int len = arr.length;
        int temp_arr[] = new int[len];

        for(int i = 0; i < len; i++) {
            temp_arr[i] = arr[len - 1 - i];
        }

        for(int i = 0; i < len; i++) {
            System.out.print(temp_arr[i] + " ");
        }
        System.out.println();

        arr = temp_arr;//直接让arr指向temp_arr的数据空间即可
        //此时，原来arr的数据空间就没有变量引用（门牌号没了），会被系统自动回收

        for(int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}