public class InfiniteSeries {


    public static void main(String[] args) {
        for (double i = 0.1; i <= 100; i *= 10) {
            check(i);
        }
        for (double i = -0.1; i >= -100; i *= 10) {
            check(i);
        }
    }
    public static double myexp(double x, int n) {
        double sum = 1;
        double numerator = 1;
        double denominator = 1;
        for (int i = 1; i <= n; i++){
            numerator *= x;
            denominator *= i;
            sum += numerator/denominator;
        }
        return sum;
    }
    public static void check(double x) {
        int n = 100;
        System.out.println(x + "\t" + myexp(x, n) + "\t" + Math.exp(x));
    }
}
