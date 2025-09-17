public class ArithmeticOperator {
    public static void main(String[] args) {
        //使用
        System.out.println(10 / 4);
        System.out.println(10.0 / 4);

        double d = 10 / 4;
        //这里先是得出2，然后赋给double类型的变量d，进行精度提升变成2.0
        System.out.println(d);

        //%：取模，求余数
        //取模的本质：a % b  a - a / b * b
        System.out.println(10 % 3);//1
        System.out.println(-10 % 3);//-1
        System.out.println(10 % -3);//1
    }
}