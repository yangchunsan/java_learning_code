public class Method01 {
    public static void main(String[] args) {

        Person person = new Person();
        person.cal01();
        person.cal02(100);
        person.speak();;
        person.getSum(1, 10);

    }
}

class Person {
    public void speak() {
        System.out.println("我是一个好人");
    }

    public void cal01() {
        int sum = 0;
        for(int i = 1; i <= 1000; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    public void cal02(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    public void getSum(int a, int b) {
        System.out.println((a + b));
    }
}