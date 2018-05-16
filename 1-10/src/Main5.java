import java.util.LinkedList;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值
 *
 * 解法：堆栈
 *
 * @author HXP
 * @date 2018/05/16 11:08
 */
public class Main5 {
    public LinkedList<Integer> printListFromTailToHead(ListNode listNode) {
        LinkedList<Integer> list = new LinkedList<>();
        if (listNode == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode);
            listNode = listNode.next;
        }
        while (!stack.empty()) {
            list.add(stack.pop().data);
        }
        return list;
    }
}

/**
 * 链表结点
 */
class ListNode {

    ListNode next;
    int data;

}