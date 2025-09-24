//重要特点
//arr[i][j] = arr[i -1][j] + arr[i -1][j - 1];

//打印十行杨辉三角
//public class YangHui {
//    public static void main(String[] args) {
//
//        int arr[][] = new int[10][];//创建二维数组，其中有十个一维数组
//
//        //为一维数组开辟空间并赋值
//        for(int i = 0; i < arr.length; i++) {
//            //杨辉三角特点：第n行就有n个元素
//            arr[i] = new int[i + 1];//开辟空间
//
//            for(int j = 0; j < arr[i].length; j++) {
//                //每一行的第一个数字和最后一个数字都是1
//                if(j == 0 || j == arr[i].length - 1) {
//                    arr[i][j] = 1;
//                }else {
//                    arr[i][j] = arr[i -1][j] + arr[i -1][j - 1];//重要性质
//                }
//            }
//        }
//
//        //打印这个杨辉三角
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//                }
//            System.out.println();
//        }
//
//    }
//}


public class YangHui {
    public static void main(String[] args) {
        String foo="blue";
        boolean[] bar = new boolean[2];

        if(bar[0]) {
            foo="green";
        }
        System.out.println(foo);

        //遍历数组
        for(int i = 0; i < bar.length; i++) {
            System.out.print(bar[i] + " ");
        }
    }
}