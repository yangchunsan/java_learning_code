public class VarParameter01 {
    public static void main(String[] args) {

        HspMethod m = new HspMethod();
        int res = m.sum(1, 4, 5);
        System.out.println(res);
    }
}

class HspMethod {

    //可以计算n个数的和
    //java允许将同一个类中，多个同名同功能但是参数个数不同的方法直接封装成一个方法，通过可变参数

    //int... 表示接受的是可变参数，类型是int，可以接受多个int
    //使用可变参数的时候，nums可以当做数组来使用
    public int sum(int... nums) {

        System.out.println("接受的参数个数：" + nums.length);
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            res += nums[i];
        }

        return res;
    }




}