//public class Homework05 {
//    public static void main(String[] args) {
//        int n = 1;
//        int count = 0;
//
//        while(n <= 100) {
//            if(n % 5 != 0) {//不能整除
//            System.out.print(n + " ");
//            count++;
//
//            if(count == 5) {
//                System.out.println();
//                count = 0;
//            }
//
//            }
//            n++;
//        }
//    }
//}

public class Homework05 {
    public static void main(String[] args) {
        int count = 0;

        for(int i = 1; i <= 100; i++) {
            if(i % 5 != 0) {//不能整除
                System.out.print(i + "\t");
                count++;
            }

            if(count == 5) {
                System.out.println();
                count = 0;
            }
        }
    }
}

