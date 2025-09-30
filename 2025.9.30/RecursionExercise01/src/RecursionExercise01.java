public class RecursionExercise01 {

    public static void main(String[] args) {

        T t = new T();
        int res = t.fibonacci(8);
        System.out.println(res);
    }
}

class T {
    public int fibonacci(int n) {

        if(n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}