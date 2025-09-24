//public class TwoDimensionalArray {
//    public static void main(String[] args) {
//        //创建一个二维数组并输出默认值
//        int arr[][] = new int[3][3];
//
//        for(int i = 0; i < 3; i++) {
//            for(int j = 0; j < 3; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class TwoDimensionalArray {
//    public static void main(String[] args) {
//        //创建一个二维数组并输出默认值
//        //动态初始化
////        int arr[][] = new int[3][3];//一步到位
//        int arr[][];//先声明
//        arr = new int[3][3];//再定义
//
//        for(int i = 0; i < 3; i++) {
//            for(int j = 0; j < 3; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class TwoDimensionalArray {
//    public static void main(String[] args) {
//
//        //动态创建二维数组，已知一维数组的个数，但未初始化（没有开辟空间）
//        int arr[][] = new int[3][];
//
//        for(int i = 0; i < arr.length; i++) {
//            //要给每一个一维数组开辟空间，不然arr[i] = NULL
//            arr[i] = new int[i + 1];
//        }
//
//        for(int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

public class TwoDimensionalArray {
    public static void main(String[] args) {

        //静态构建二维数组
        int arr[][] = {{4, 6}, {1, 4, 5, 7}, {-2}};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(sum);
    }
}