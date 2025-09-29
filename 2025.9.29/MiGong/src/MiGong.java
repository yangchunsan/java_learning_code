public class MiGong {

    public static void main(String[] args) {

        //明确迷宫的形状，规定数组内元素为0所在的区域是可以通过的，1是不可以通过的
        int map[][] = new int[8][7];//八行七列


        //设定边界和障碍
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
        }

        for (int i = 0; i < 7; i++) {
            map[7][i] = 1;
        }

        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
        }

        for (int i = 0; i < 8; i++) {
            map[i][6] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;

        //输出当前的迷宫情况
        System.out.println("接下来将输出迷宫情况");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }

            System.out.println();
        }

        //使用findWay方法寻路
        T t = new T();
        t.findWay(map, 1, 1);

        //打印寻路后数组情况
        System.out.println("接下来将输出寻路后迷宫情况");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }

            System.out.println();
        }
    }
}

class T {
    //使用递归回溯思想来解决寻路问题
    //1.findWay方法就是专门用来寻找路径的方法
    //2.如果找到路径了，就返回true，如果没有找到路径，就返回false
    //3.map就是二维数组，用来表示迷宫
    //4.i,j是老鼠的坐标，用来表示老鼠所在的位置
    //5.先规定数组map各个元素的数值代表的实际含义
    //0表示无障碍物，1表示有障碍物，2表示走过此处，3表示走过此处但是死路
    //6.当map[6][5] = 2 时，代表路径找到，老鼠到达出口，否则将继续寻找
    //7.确定老鼠寻路的优先逻辑，下－> 右 -> 上 -> 左

    public boolean findWay(int map[][], int i, int j) {

        if (map[6][5] == 2) {//说明找到出口啦
            return true;
        } else {//没有，那就按我们设定的寻路逻辑开始寻找

            //先判断这个元素所在地能不能通过
            if (map[i][j] == 0) {//能进入分支结构说明可以通过

                //我们先假设这条路可以走到出口
                map[i][j] = 2;

                //使用寻路策略，来确认这条路是不是真的可以走
                if (findWay(map, i + 1, j)) {//先往下走
                    return true;
                } else if (findWay(map, i, j + 1)) {//往右走
                    return true;
                } else if (findWay(map, i - 1, j)) {//往上走
                    return true;
                } else if (findWay(map, i, j - 1)) {//往左走
                    return true;
                } else {
                    //到了这里，说明上下左右都走不了了，是死路
                    map[i][j] = 3;
                    return false;
                }
            } else {//三种情况啦：1, 2, 3
                return false;
            }
        }
    }
}