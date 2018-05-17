import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。
 * 队列中的元素为int类型。
 * <p>
 * 思路：一个栈压入元素，而另一个栈作为缓冲，将栈1的元素出栈后压入栈2中。也可以将栈1中的最后一个元素直接出栈，而不用压入栈2中再出栈。
 *
 * @author HXP
 * @date 2018/05/17 15:26
 */
public class Main7 {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.empty() && stack2.empty()) {
            throw new NoSuchElementException("stack is empty");
        }
        if (stack2.empty()) {

            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
