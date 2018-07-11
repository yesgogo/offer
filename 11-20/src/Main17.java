/**
 * 合并两个有序的链表
 *
 * @author xphe
 * @date 2018/07/11
 */
public class Main17 {

    public ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return null;
        }
        if (list2 == null) {
            return null;
        }
        if (list1.val <= list2.val) {
            list1.next = merge(list1.next, list2);
            return list1;
        } else {
            list2.next = merge(list1, list2.next);
            return list2;
        }
    }

    private class ListNode {
        int val;
        ListNode next;
    }
}
