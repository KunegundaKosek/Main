import java.math.BigInteger;

public class Bigdecimal {


    public static void main(String[] args) {
        System.out.println(Factorial(1));

    }

    public static BigInteger Factorial(int n) {
        if (n == 0) {
            return new BigInteger("1");
        } else {
            BigInteger result = new BigInteger("1");
            for (int i = 1; i <= n; i++) {
                result = result.multiply(new BigInteger(Integer.toString(i)));
            }
            return result;
        }
    }
}
