public class Method02 {
    public static void main(String[] args) {

        //创建一个数组
        int map[][] = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};

        //使用方法进行遍历
        MyTools tool = new MyTools();//先创建一个类对象
        tool.printArr(map);//然后再调用方法
    }
}

class MyTools {
    public void printArr(int map[][]) {
        //对传入的map数组进行遍历输出
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }

            System.out.println();
        }
    }
}