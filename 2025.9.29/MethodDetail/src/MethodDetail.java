public class MethodDetail {
    public static void main(String[] args) {

        AA a = new AA();
        int res[] = a.getSumAndSub(1, 4);
        System.out.println("和为" + res[0]);
        System.out.println("差为" + res[1]);
    }
}

class AA {


    //1.一个方法最多有一个返回值，如果要返回多个结果，可以利用数组
    public int[] getSumAndSub(int n1, int n2) {

        int resArr[] = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;

        return resArr;
    }

    //2.返回类型可以是任意数据类型，包括基本数据类型和引用数据类型

    //3.如果方法要求有返回数据类型，则方法体的最后执行语句必须为返回（return）值
    // 并且返回值的类型必须和return的值的类型一致或者兼容（满足自动类型转换）

    public double f1() {
        double d1 = 3.3;
        int n = 100;
        return n;//自动类型转换int - > double
    }

    //4.如果方法没有要求返回数据类型（void），方法体中没有return语句，即使有，其后也不可以带有任何值或者表达式
    public void f2() {
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");

        return;

    }
}