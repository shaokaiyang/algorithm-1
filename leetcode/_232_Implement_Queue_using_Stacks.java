import java.util.Stack;

/**
 * @author sunxiaoyang
 */
public class _232_Implement_Queue_using_Stacks {
    Stack<Integer> stk1 = new Stack<Integer>();
    Stack<Integer> stk2 = new Stack<Integer>();

    // Push element x to the back of queue.
    public void push(int x) {
        while (!stk1.empty()) {
            stk2.push(stk1.pop());
        }
        stk1.push(x);
        while (!stk2.empty()) {
            stk1.push(stk2.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        stk1.pop();
    }

    // Get the front element.
    public int peek() {
        return stk1.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stk1.empty();
    }
}
