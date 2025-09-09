package Chapter2.Operators;

public class LogicalOp {

    public static void main(String[] args) {
        int a = 3, b = 5, c = 10, d = 12;
        boolean e = false, f = true;

        boolean results = !e;

        results = e && f;
        results = f || e;

        System.out.println( a > 0 && e && b <= 5);
        System.out.println((f || b == a) || (c > a));
        System.out.println((f || b == a) || (c <  a));
        System.out.println( !(a >= 5 ) && (b <= 5));
    }
}
