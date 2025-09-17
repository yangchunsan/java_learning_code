//演示逻辑运算符的使用
public class LogicOperator01 {
    public static void main(String[] args) {
    //&& 和 & 案例演示
//    int age = 50;
//        if (age > 20 && age < 90) {
//            System.out.println("middle-aged person");
//        }
//
//        if (age > 20 & age < 90) {
//            System.out.println("middle-aged person");
//        }

        //区别
        int a = 4;
        int b = 9;
        if (a < 1 && ++b < 50) {
            System.out.println("ok");
        }
        System.out.println("a = " + a + " b = " + b);
        //对于短路与&&而言，如果第一个条件为false，语句判断停止，不会再进行第二个条件的判断

        if (a < 1 & ++b < 50) {
            System.out.println("ok");
        }
        System.out.println("a = " + a + " b = " + b);
        //对于逻辑与&而言，即使第一个条件为false，后面的条件仍然会判断（效率更低
    }
}