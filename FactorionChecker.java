public class FactorionChecker {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static boolean isFactorion(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }

        return sum == num;
    }
}