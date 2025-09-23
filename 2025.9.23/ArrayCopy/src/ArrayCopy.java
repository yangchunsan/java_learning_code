//要求数据空间不同即可！

public class ArrayCopy {
    public static void main(String[] args) {
        int arr1[] = {10, 20, 30};

        //开辟新的数据空间
        int arr2[] = new int[arr1.length];

        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }

        //打印
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        arr2[0] = 100;

        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

    }
}