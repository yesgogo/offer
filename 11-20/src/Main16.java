/**
 * 反转链表
 *
 * @author xphe
 * @date 2018/07/01
 */
public class Main16 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = null;
        // 递归
        ListNode newHead = reverseList(next);
        next.next = head;
        return newHead;
    }

    private class ListNode {
        int val;
        ListNode next;
    }
}
