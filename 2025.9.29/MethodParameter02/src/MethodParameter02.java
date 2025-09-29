public class MethodParameter02 {

    public static void main(String[] args) {
        B b = new B();
        int arr[] = {1, 2, 3};
        b.test100(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //对象传参测试
        Person p = new Person();
        p.name = "jack";
        p.age = 10;
        System.out.println(p.age + " " +p.name);
        b.test200(p);
        System.out.println(p.age + " " +p.name);
    }
}

class Person {
    String name;
    int age;
}

class B {

    public void test100(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr[0] = 200;
        //遍历数组
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void test200(Person p) {
        p.age = 100;
        p.name = "love";
        System.out.println(p.age + " " +p.name);
    }
}