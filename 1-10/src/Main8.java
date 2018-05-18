/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0
 * <p>
 * 思路：利用二分法，找到中间的数，然后和最左边的值进行比较，
 * 若大于最左边的数，则最左边从mid开始，若小于最右边值，则最右边从mid开始。
 * 若左中右三值相等，则取mid前后值中较小的数。
 *
 * @author HXP
 * @date 2018/05/18 17:33
 */
public class Main8 {
    public static int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int low = 0;
        int hi = array.length - 1;
        int mid = low;

        while (array[low] >= array[hi]) {
            if (hi - low <= 1) {
                mid = hi;
                break;
            }
            mid = low + (hi - low) / 2;

            if (array[low] == array[mid] && array[hi] == array[mid]) {
                return minInOrder(array);
            }

            if (array[mid] >= array[low]) {
                low = mid;
            } else if (array[mid] <= array[hi]) {
                hi = mid;
            }
        }
        return array[mid];
    }

    private static int minInOrder(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8, 2, 3, 4};
        System.out.println(minNumberInRotateArray(array));
    }
}
