public class ArrayExercise02 {
    public static void main(String[] args) {

        int arr[] = {4, -1, 9, 10, 23};//创建一个数组
        int max = arr[0];
        int maxIndex = 0;

        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("数组内的最大值是" + max);
        System.out.println("其下标是" + maxIndex);
    }
}