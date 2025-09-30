public class HanoiTower {

    public static void main(String[] args) {

        Tower tower = new Tower();
        tower.move(4, 'A', 'B', 'C');

    }
}

class Tower {

    //num表示要移动的盘子的个数，abc则分别代表三个塔
    public void move(int num, char a, char b, char c) {

        //如果只有一个盘
        if(num == 1) {
            System.out.println(a + "->" + c);
        } else {
            //如果有多个盘，直接分成两部分：最下面的一个最大的盘，和上面的所有盘（以此为递归的手段）

            //1. 先移动中间所有的盘到b，借助c做暂时中转站
            move(num - 1, a, c, b);
            //2. 将最下面的盘移动到c
            System.out.println(a + "->" + c);
            //3. 最后把b中的所有盘转移到c，借助a做暂时中转站
            move(num - 1, b , a, c);
        }
    }
}