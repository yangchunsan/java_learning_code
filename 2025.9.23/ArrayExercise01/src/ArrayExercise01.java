public class ArrayExercise01 {
    public static void main(String[] args) {
        char charter[] = new char[26];
//        char start = 'A';
//
//        for(int i = 0; i < 26; i++,start++) {
//            charter[i] = start;
//        }


        for(int i = 0; i < 26; i++) {
            charter[i] = (char)('A' + i);//'A' + i 的数据类型是int，需要强制类型转换
        }

        for(int i = 0; i < charter.length; i++) {
            System.out.print(charter[i] + " ");
        }
    }
}