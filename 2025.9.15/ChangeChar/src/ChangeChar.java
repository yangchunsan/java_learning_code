//转义字符的使用

public class ChangeChar{

    //编写一个main方法
    public static void main(String[] args){

        // \t :一个制表符，实现对齐的功能
        System.out.println("北京\t天津\t上海");

        // \n :换行符
        System.out.println("jack\nsmith\nmary");

        // \\ :代表一个\
        System.out.println("D:\\Code\\Java_Code\\2025.9.15");

        // \'和\"  : 就是在双引号里面的单引号和双引号
        System.out.println("他转述了我说的话：\"我说：\'我爱你\'\"");

        // \r :代表一个回车
        //要注意，回车和换行不是一个东西
        System.out.println("南京邮电大学\r江苏");
        System.out.println("江苏\r南京邮电大学");
        //这里因为ide自身的优化原因导致无法正常覆盖，在标准命令行终端的输出如下：
        //江苏邮电大学
        //南京邮电大学

        System.out.println("南京邮电大学\r\n江苏");
        //输出结果是：
        //南京邮电大学
        //江苏
    }
}