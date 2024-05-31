package Question;
import java.util.EmptyStackException;
public class stackQueue {
        private int[] stack1;
        private int[] stack2;
        private int top1;
        private int top2;

        public stackQueue(int capacity) {
            stack1 = new int[capacity];
            stack2 = new int[capacity];
            top1 = -1;
            top2 = -1;
        }

        public void enqueue(int item) {
            if (top1 == stack1.length - 1) {
                System.out.println("Queue is full. Cannot enqueue more items.");
                return;
            }
            stack1[++top1] = item;
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }

            if (top2 == -1) {
                while (top1 >= 0) {
                    stack2[++top2] = stack1[top1--];
                }
            }

            return stack2[top2--];
        }

        public int peek() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }

            if (top2 == -1) {
                while (top1 >= 0) {
                    stack2[++top2] = stack1[top1--];
                }
            }

            return stack2[top2];
        }

        public boolean isEmpty() {
            return top1 == -1 && top2 == -1;
        }

        public static void main(String[] args) {
            stackQueue queue = new stackQueue(5);
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            System.out.println("Dequeued item: " + queue.dequeue());
            System.out.println("Peeked item: " + queue.peek());
            queue.enqueue(40);
            queue.enqueue(50);
            System.out.println("Dequeued item: " + queue.dequeue());
        }
    }


