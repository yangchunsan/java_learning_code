
public class MethodExercise01 {
    public static void main(String[] args) {

        AA a = new AA();
        boolean key = a.isOdd(9);
        System.out.println(key);

        a.printChar(10, 4, '*');

    }
}

class AA  {
    public boolean isOdd(int n) {
//        if(n % 2 == 1) {
//            return true;
//        } else {
//            return false;
//        }

        return n % 2 == 1;
    }

    public void printChar(int row, int column, char a) {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(a + " ");
            }

            System.out.println();
        }
    }

}