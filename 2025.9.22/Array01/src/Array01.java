public class Array01 {

    public static void main(String[] args) {
        //数组
        double hens[] = {2, 2, 2, 2, 2, 2, 2};
        int sum = 0;
        System.out.println(hens.length);
        for(int i = 0; i < hens.length; i++){
            sum += hens[i];
        }
        System.out.println(sum);
    }
}