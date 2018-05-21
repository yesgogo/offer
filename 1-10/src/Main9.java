/**
 * 斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项
 *
 * @author HXP
 * @date 2018/05/21 10:54
 */
public class Main9 {
    public static int fibonacci(int n) {
        int one = 0;
        int two = 1;
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }
        int num = 0;
        for (int i = 2; i <= n; i++) {
            num = one + two;
            one = two;
            two = num;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     *
     * @param n 台阶数
     * @return 跳法
     */
    public int jumpFloorII(int n) {
        if (n <= 0) {
            return 0;
        }
        return 1 << (n - 1);
    }
}
