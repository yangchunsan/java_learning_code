//public class Homework07 {
//    public static void main(String[] args) {
//        char charter1 = 'a';
//        char charter2 = 'Z';
//
//        for(int i  = 0; i < 26; i++, charter1++) {
//            System.out.println(charter1);
//        }
//
//        for(int i  = 0; i < 26; i++, charter2--) {
//            System.out.println(charter2);
//        }
//    }
//}

public class Homework07 {
    public static void main(String[] args) {

        for(char charter1 = 'a'; charter1 <= 'z'; charter1++) {
            System.out.println(charter1);
        }

        for(char charter2 = 'Z'; charter2 >= 'A'; charter2--) {
            System.out.println(charter2);
        }
    }
}