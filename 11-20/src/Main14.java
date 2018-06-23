/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 * @author xphe
 * @date 2018/06/23
 */
public class Main14 {
    public void reOrderArray(int[] nums) {
        int oddCount = 0;
        for (int val : nums) {
            if (val % 2 == 1) {
                oddCount++;
            }
        }
        int[] copy = nums.clone();
        int i = 0;
        int j = oddCount;
        for (int val : copy) {
            if (val % 2 == 1) {
                nums[i++] = val;
            } else {
                nums[j++] = val;
            }
        }
    }

    public static void main(String[] args) {
        int[] test = new int[]{0, 2, 3, 5, 7, 7, 9, 8, 6, 1};
        new Main14().reOrderArray(test);
        for (int i : test) {

            System.out.print(i);
        }
    }
}
