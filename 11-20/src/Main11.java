/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 思路1：本题主要考虑边界问题,全面不够高效的解法，
 * 注意：由于计算机表示小数（包括float和double型小数）都有误差，我们不能直接用==判断两个小数是否相等，
 * 如果两个小数的差的绝对值很小，比如小于0.0000001，就可以认为他们相等
 *
 * @author HXP
 * @date 2018/05/22 10:12
 */
public class Main11 {

    public static double power(double base, int exponent) {

        if (equal(base) && exponent < 0) {
            throw new RuntimeException("0的复次幂没有意义");
        }
        if (equal(base)) {
            return 0;
        }
        if (exponent == 0) {
            return 1.0;
        }
        if (exponent < 0) {
            return bestPowerWithExponent(1.0 / base, -exponent);
        } else {
            return bestPowerWithExponent(base, exponent);
        }
    }

    private static double powerWithExponent(double base, int exponent) {
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    private static boolean equal(double d1) {
        return Math.abs(d1 - 0.0) < 0.0000001;
    }


    private static double bestPowerWithExponent(double base, int exponent) {

        if (exponent == 0) {
            return 1.0;
        }

        if (exponent == 1) {
            return base;
        }

        double result = bestPowerWithExponent(base, exponent >> 1);
        result *= result;

        if ((exponent & 1) == 1) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 8));
    }
}
