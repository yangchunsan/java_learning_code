
public class VarParameterExercise {
    public static void main(String[] args) {

        HspMethod hm = new HspMethod();
        System.out.println(hm.showScore("jack", 100, 3));
        System.out.println(hm.showScore("man", 100, 3, 5, 190));
    }
}

class HspMethod {

//    public void showScore(String name, double... scores) {
//        double totalScore = 0;
//
//        for(int i = 0; i < scores.length; i++) {
//            totalScore += scores[i];
//        }
//
//        System.out.println("学生姓名是：" + name + " 总分是：" + totalScore);
//    }

    public String showScore(String name, double... scores) {
        double totalScore = 0;

        for(int i = 0; i < scores.length; i++) {
            totalScore += scores[i];
        }

        return name + " " + totalScore;
    }
}