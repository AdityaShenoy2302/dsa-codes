import java.util.*;

public class stackWith2Queues {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = -1;

            if (!q1.isEmpty()) {
                while (q1.size() != 1) {
                    q2.add(q1.remove());
                }
                top = q1.remove();
            } else {
                while (q2.size() != 1) {
                    q1.add(q2.remove());
                }
                top = q2.remove();
            }

            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = -1;

            if (!q1.isEmpty()) {
                while (q1.size() != 1) {
                    q2.add(q1.remove());
                }
                top = q1.remove();
                q2.add(top);
            } else {
                while (q2.size() != 1) {
                    q1.add(q2.remove());
                }
                top = q2.remove();
                q1.add(top);
            }

            return top;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
