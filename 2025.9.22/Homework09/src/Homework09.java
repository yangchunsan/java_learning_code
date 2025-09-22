//public class Homework09 {
//    public static void main(String[] args) {
//        int final_sum = 0;
//
//        for(int i = 1; i <= 100; i++) {
//            int tem_sum = 0;
//
//            for(int j = 1; j <= i; j++) {
//                tem_sum += j;
//            }
//            final_sum += tem_sum;
//        }
//
//        System.out.println(final_sum);
//    }
//}

public class Homework09 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 100; i++) {


            for(int j = 1; j <= i; j++) {
                sum += j;
            }

        }

        System.out.println(sum);
    }
}