public class Recursion01 {
    public static void main(String[] args) {

        T t = new T();
        int res = t.factorial(7);
        System.out.println(res);
    }
}

class T {

    public int factorial(int n) {

        if(n == 1) {
            return n;
        } else {
            return factorial(n - 1) * n;
        }
    }
}