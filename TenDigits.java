public class TenDigits {
    //找到Math.E连续数字中的10位质数数字
    public static void main(String[] args) {
        int[] tenDigits = new int[10];

    }

    public static boolean isPrime(int n) {
        boolean isPrime = true;
    for (int i = 2; isPrime && i <= n; i++) {
            if (n % i == 0)
                isPrime = false;
        }
        return isPrime;
    }
}
