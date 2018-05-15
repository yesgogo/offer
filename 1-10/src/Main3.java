/**
 * 二维数组查找
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * @author HXP
 * @date 2018/05/15 10:41
 */
public class Main3 {
    public boolean find(int[][] array, int key) {
        if (array == null) {
            return false;
        }

        int row = 0;
        int column = array[0].length;

        while (row < array.length && column >= 0) {
            if (array[row][column] == key) {
                return true;
            }
            if (key < array[row][column]) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}
