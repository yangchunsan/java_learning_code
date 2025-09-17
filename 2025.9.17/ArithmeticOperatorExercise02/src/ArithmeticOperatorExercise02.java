
public class ArithmeticOperatorExercise02 {
    public static void main(String[] args) {
        int day = 59;
        int week = 7;
        int weeks = day / week;
        int lefrdays = day % week;
        System.out.println("合" + weeks + "个星期" + lefrdays + "天");
    }
}