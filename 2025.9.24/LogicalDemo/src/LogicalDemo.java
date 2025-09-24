public class LogicalDemo {
    static void tag(char x) { System.out.print(x); }
    static boolean a() { tag('A'); return true; }
    static boolean b() { tag('B'); return true; }
    static boolean c() { tag('C'); return false; }
    public static void main(String[] args) {
        tag((a() || b() && c()) ? '1' : '0');
        tag((a() |  b() &  c()) ? '1' : '0');
    }
}