/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 * @author HXP
 * @date 2018/05/21 11:49
 */
public class Main10 {
    public static int numberOf1(int n) {
        int flag = 1;
        int count = 0;
        while (flag != 0) {

            if ((n & flag) == 1) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    public static int bestNumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            // 二进制最右边的1变成0
            n = (n - 1) & n;
        }
        return count;
    }
}
