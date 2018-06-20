/**
 * 在 O(1) 时间内删除链表节点
 *
 * @author xphe
 * @date 2018/06/18
 */
public class Main13 {
    public ListNode deleteNode(ListNode head, ListNode tobeDelete) {
        if (head == null || tobeDelete == null) {
            return null;
        }
        // 不是尾结点
        if (tobeDelete.next != null) {
            tobeDelete.val = tobeDelete.next.val;
            tobeDelete.next = tobeDelete.next.next;
        }else {
            ListNode cur = head;
            while (cur.next != tobeDelete) {
                cur = cur.next;
            }
            cur.next = null;
        }

        return tobeDelete;
    }

    private class ListNode {
        ListNode next;
        int val;
    }
}
