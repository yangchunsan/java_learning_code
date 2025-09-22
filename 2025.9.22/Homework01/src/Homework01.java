//我自己写的
//public class Homework01 {
//    public static void main(String[] args){
//
//        double money = 100000;//拥有十万块钱
//        double tax1 = 0.05;
//        double tax2 = 1000;
//        int count = 0;//能通过的次数
//
//        while (money > 0) {
//            if (money > 50000){
//                money = money * (1.0 - tax1);
//                count++;
//            } else {
//                money -= 1000;
//                count++;
//
//                if (money < 1000){
//                    break;
//                }
//            }
//        }
//        System.out.println("能通过"+ count + "次");
//    }
//}

//老师写的

public class Homework01 {
    public static void main(String[] args) {
        double money = 100000;
        int count = 0;
        while (true) {
            if (money > 50000) {
                money *= 0.95;
                count++;
            } else if (money >= 1000) {
                money -= 1000;
                count++;
            } else {
                break;
            }
        }
        System.out.println("能通过" + count + "次");
    }
}