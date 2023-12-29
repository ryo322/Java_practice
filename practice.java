public class practice {
    public static void main(String[] args) {
        //1-1
        System.out.println("Hello World");
        //1-2
        int a = 11;
        System.out.println("a=" + a);
        //1-3
        int b = 13;
        int c = 17;
        System.out.println("b+c=" + (b + c));
        //1-4
        int d = 13 + 17;
        System.out.println("d=" + d);
        //1-5
        System.out.println("13+17=" + (13 + 17));
        //1-6
        int e = 7;
        e = e * 3;
        System.out.println("e=" + e);
        e = e / 2;
        System.out.println("e=" + e);
        //1-7
        int f = 3;
        int g = 7;
        int h = f + g;

        f = h - f;
        g = h - g;
        System.out.println("f=" + f + ",g=" + g);
        //1-8
        int i = 19;
        int j = 23;
        int k = i * j;
        System.out.println("k=" + k);
        //1-9
        int l = 10;
        System.out.println("l=" + (l * 2));
        System.out.println("l=" + (l * 3));
        System.out.println("l=" + (l * 4));
        //1-10
        int m = 10;
        System.out.println("m=" + (m * 1));
        System.out.println("m=" + (m * m));
        System.out.println("m=" + (m * m * m));
        //1-11
        int n = 10;
        System.out.println(n + "÷３＝" + (n / 3) + "あまり" + (n % 3));
        //1-12
        int o = 10;
        o++;
        System.out.println(o);
        o--;
        o--;
        System.out.println(o);
    }
}
