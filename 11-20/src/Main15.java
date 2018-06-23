/**
 * 找链表中倒数第k个结点
 * <p>
 * 两个指针，先让第一个指针和第二个指针都指向头结点，然后再让第一个指正走(k-1)步，
 * 到达第k个节点。然后两个指针同时往后移动，当第一个结点到达末尾的时候，第二个结点所在位置就是倒数第k个节点了
 *
 * @author xphe
 * @date 2018/06/23
 */
public class Main15 {

    public ListNode findKthToTail(ListNode head, int k) {
        if (head == null || k < 0) {
            return null;
        }
        ListNode left = head;
        ListNode right = head;
        for (int i = 0; i < k - 1; i++) {
            // 避免没有倒数第k个
            if (right.next != null) {
                right = right.next;
            } else {
                return null;
            }
        }
        while (right.next != null) {
            left = left.next;
            right = right.next;
        }
        return left;
    }

    private class ListNode {
        int val;
        ListNode next;
    }
}
