public class FloatDetail {
    //
    public static void main(String[] args) {

        //java的浮点型常量（具体值）默认是double型，如果要声明float型常量，需要在数字后加上“f”或者“F”
        float num = 1.1f;
        double num1 = .993;
        double num2 = 5.12e2;
        double num3 = 512E-2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        //浮点数使用陷阱：2.7 vs 8.1/3
        double num4 = 2.7;
        double num5 = 8.1/3;
        System.out.println(num4);
        System.out.println(num5);//是一个接近2.7的小数，不能得到精准的数值
        //对运算结果是小数的相等判断要小心
        //应该是以两个数的差值的绝对值，在某个精度范围类判断
        if(Math.abs(num5 - num4) < 0.0000000001){
            System.out.println("差值非常小，可忽略，近似相等");
        }
        System.out.println(Math.abs(num5 - num4));


    }
}