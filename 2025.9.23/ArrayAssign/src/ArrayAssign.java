public class ArrayAssign {
    public static void main(String[] args) {
        //基本数据类型赋值，这个值就是具体的数据，而且相互不影响，即赋值方式是值拷贝
        int n1 = 10;
        int n2 = n1;
        n2 = 80;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        //数组在默认情况下是引用传递，赋的是地址,即复制方式是引用传递（地址拷贝
        int arr1[] = {1, 2, 3};
        int arr2[] = arr1;//赋值
        arr2[0] = 10;

        System.out.println("===============");

        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("===============");

        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}