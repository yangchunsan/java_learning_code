public class MethodParameter01 {
    public static void main(String[] args) {

        AA aa = new AA();
        int a = 1;
        int b = 8;
        aa.swap(a, b);
        System.out.println("a = " + a + " " + "b = " + b);

    }
}

class AA {


    public void swap(int a, int b) {
        System.out.println("a = " + a + " " + "b = " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a = " + a + " " + "b = " + b);
    }
}